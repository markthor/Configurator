<?php

class validator {
    var $json;
    var $post;

    public function __construct($json, $post) {
        $this->json = json_decode($json);
        $this->post = $post;
    }

    public function validate(){
        $res = $this->checkParameters();
        if(!$res) {
            echo "Some parameters failed <br/>";
            return false;
        }
        echo "All parameters passed <br/>";
        return $this->checkConstraints();
    }

    private function checkParameters()
    {
        $res = true;
        if (isset($this->json->root->expressions->parameter)) {
            foreach ($this->json->root->expressions->parameter as $param) {
                //Check that an assignment is in the post request
                $res = $res && isset($this->post[$param->name]);
                if (!isset($this->post[$param->name])) {
                    echo($param->name . " is not in post data");

                    return false;
                }
                if ($param->type == "IntegerType" && !is_numeric($this->post[$param->name])) {
                    echo $this->post[$param->name] . " is not a numeric value";

                    return false;
                }
                if ($param->type == "BooleanType" && $this->boolval($this->post[$param->name]) == null) {
                    echo $this->post[$param->name] . " is not a boolean value <br/>";

                    return false;
                }
                if ($param->type == "StringType" && trim($this->post[$param->name]) == '') {
                    echo $this->post[$param->name] . " is not a non-empty string value <br/>";

                    return false;
                }
            }

            return true;
        }
        return true;
    }

    private function checkConstraints(){
        if(isset($this->json->root->expressions->binaryConstraints)) {
            foreach ($this->json->root->expressions->binaryConstraints as $bc) {
                if ($this->boolval($bc->root)) {
                    $res = $this->validateBinary($bc);
                    var_dump($res);
                    if (!$res)
                        return false;
                    else if($res->type == "BooleanType" && $res->value == false)
                        return false;
                }
            }
        }
        if(isset($this->json->root->expressions->unaryConstraints)) {
            foreach ($this->json->root->expressions->unaryConstraints as $uc) {
                if ($this->boolval($uc->root)) {
                    $res = $this->validateUnary($uc);
                    var_dump($res);
                    if (!$res) {
                        return false;
                    }
                    else if($res->type == "BooleanType" && $res->value == false)
                        return false;
                }
            }
        }
        return true;
    }

    private function validateBinary($binConstraint){
        $left = $this->getExpr($binConstraint->left)["element"];
        echo"Dumping left side:";
        var_dump($left);
        $leftType = $this->getExpr($binConstraint->left)["type"];
        echo"Left type:";
        var_dump($leftType);
        $right = $this->getExpr($binConstraint->right)["element"];
        echo "Dumping right side:";
        var_dump($right);
        $rightType = $this->getExpr($binConstraint->right)["type"];
        echo"Right type:";
        var_dump($rightType);

        echo"Dumping constraint";
        var_dump($binConstraint);

        $obj = new stdClass();
        $obj->name = "";
        switch($binConstraint->operator) {
            case "less":
                if($leftType == "IntegerType" && $rightType == "IntegerType") {
                    $obj->value = $left->value < $right->value;
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "greater":
                if($leftType == "IntegerType" && $rightType == "IntegerType") {
                    $obj->value = $left->value > $right->value;
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "equal":
                $obj->value = $left->value == $right->value;
                $obj->type = "BooleanType";
                return $obj;
            case "addition":
                if($leftType == "IntegerType" && $rightType == "IntegerType" && $binConstraint->root == "false") {
                    $obj->value = $left->value + $right->value;
                    $obj->type = "IntegerType";
                    return $obj;
                }
                $obj->name = "Case addition: leftType: " . $leftType . " rightType: " . $rightType . " root: " . $binConstraint->root;
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "multiplication":
                if($leftType == "IntegerType" && $rightType == "IntegerType" && $binConstraint->root == "false") {
                    $obj->value = $left->value * $right->value;
                    $obj->type = "IntegerType";
                    return $obj;
                }
                $obj->name = "Multiplication typeCheck failed";
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "subset":
                if($rightType == "set") {
                    $obj->value = in_array($left, $right->has);
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->name = "Subset failed";
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "and":
                if($leftType == "BooleanType" && $rightType == "BooleanType") {
                    $obj->value = $this->boolval($left->value) && $this->boolval($right->value);
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->name = "and failed";
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "or":
                echo "In or <br/>";
                if($leftType == "BooleanType" && $rightType == "BooleanType") {
                    echo "Left: " . $this->boolval($left->value) . " || right " . $this->boolval($right->value);
                    $obj->value = $this->boolval($left->value) || $this->boolval($right->value);
                    var_dump($obj->value);
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->name = "or failed";
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            default :
                $obj->name = "No matches for this operator: " . $binConstraint->operator;
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
        }
    }

    private function validateUnary($unaryConstraint)
    {
        $left = $this->getExpr($unaryConstraint->expression)["element"];
        echo"Dumping left unary: <br/>";
        var_dump($left);
        $leftType = $this->getExpr($unaryConstraint->expression)["type"];
        echo"Left type: <br/>";
        var_dump($leftType);
        switch($leftType) {
            case "BinaryConstraint" :
                $res = $this->validateBinary($left);
                $res->value = !$res->value;
                return $res;
            case "UnaryConstraint" :
                $res = $this->validateUnary($left);
                $res->value = !$res->value;
                return $res;
            case "BooleanType" :
                $left->value = ! $this->boolval($left->value);
                return $left;
        }

    }

    private function getExpr($exprName){
        $expressions = $this->json->root->expressions;
        $ret = array("element" => "", "type" => "");

        if(isset($expressions->binaryConstraints)) {
            foreach ($expressions->binaryConstraints as $bc) {
                if ($bc->name == $exprName) {
                    $ret["type"] = "BinaryConstraint";
                    $ret["element"] = $bc;

                    $res = $this->validateBinary($bc);
                    $ret["type"] = $res->type;
                    $ret["element"] = $res;

                    return $ret;
                }
            }
        }
        if(isset($expressions->unaryConstraints)) {
            foreach ($expressions->unaryConstraints as $uc) {
                //echo"Unary constraint: " . $uc->name . " expr name: " . $exprName . "<br/>";
                if ($uc->name == $exprName) {
                    $ret["type"] = "UnaryConstraint";
                    $ret["element"] = $uc;
                    $res = $this->validateUnary($uc);
                    $ret["type"] = $res->type;
                    $ret["element"] = $res;

                    return $ret;
                }
            }
        }
        if(isset($expressions->sets)) {
            foreach($expressions->sets as $set) {
                if($set->name == $exprName) {
                    $obj = new stdClass();
                    $obj->name = $set->name;
                    $obj->has = $set->has;
                    $obj->type = "";

                    $ret["element"] = $obj;
                    $ret["type"] = "set";
                    return $ret;
                }
            }
        }
        if(isset($expressions->parameter)) {
            foreach ($expressions->parameter as $param) {
                if ($param->name == $exprName) {
                    $value = $this->post[$param->name];
                    if (is_numeric($value)) {
                        $obj = new stdClass();
                        $obj->value = $value;
                        $obj->name = $param->name;
                        $obj->type = "IntegerType";
                        $ret["type"] = "IntegerType";
                        $ret["element"] = $obj;

                        return $ret;
                    }
                    if ($this->boolval($value)) {
                        $obj = new stdClass();
                        $obj->value = $value;
                        $obj->name = $param->name;
                        $obj->type = "BooleanType";
                        $ret["type"] = "BooleanType";
                        $ret["element"] = $obj;

                        return $ret;
                    }
                    $obj = new stdClass();
                    $obj->value = $value;
                    $obj->name = $param->name;
                    $obj->type = "StringType";
                    $ret["type"] = "StringType";
                    $ret["element"] = $obj;

                    return $ret;
                }
            }
        }

        if(isset($expressions->values)) {
            foreach($expressions->values as $val) {
                if($val->name == $exprName) {
                    $ret["type"] = $val->type;
                    $ret["element"] = $val;

                    return $ret;
                }
            }
        }

        return $ret;
    }

    private function boolval($in) {
        $res = null;
        if(strcmp($in, 'false') || $in == false)
            return false;
        if(strcmp($in, 'true') || $in == true)
            return true;
        return $res;
    }

//    private function boolval($in, $strict=false) {
//        $out = null;
//        // if not strict, we only have to check if something is false
//        if (in_array($in,array('false', 'False', 'FALSE', 'no', 'No', 'n', 'N', '0', 'off',
//            'Off', 'OFF', false, 0, null), true)) {
//            $out = false;
//        } else if ($strict) {
//            // if strict, check the equivalent true values
//            if (in_array($in,array('true', 'True', 'TRUE', 'yes', 'Yes', 'y', 'Y', '1',
//                'on', 'On', 'ON', true, 1), true)) {
//                $out = true;
//            }
//        } else {
//            // not strict? let the regular php bool check figure it out (will
//            //     largely default to true)
//            $out = ($in?true:false);
//        }
//        return $out;
//    }
}

?>