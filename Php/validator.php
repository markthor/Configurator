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
                if ($param->type == "BooleanType" && $this->boolval($this->post[$param->name]) === null) {
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
        $leftType = $this->getExpr($binConstraint->left)["type"];
        $right = $this->getExpr($binConstraint->right)["element"];
        $rightType = $this->getExpr($binConstraint->right)["type"];

        $obj = new stdClass();
        $obj->name = "";
        switch($binConstraint->operator) {
            case "less":
                if($leftType == "IntegerType" && $rightType == "IntegerType") {
                    $leftValue = (int) $left->value;
                    $rightValue = (int) $right->value;
                    $res = $leftValue < $rightValue;
                    $obj->value = $res;
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "greater":
                if($leftType == "IntegerType" && $rightType == "IntegerType") {
                    $obj->value = (int) $left->value > (int) $right->value;
                    $obj->type = "BooleanType";
                    return $obj;
                }
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "equal":
                $obj->value = 0 == strcmp($left->value, $right->value);
                $obj->type = "BooleanType";
                return $obj;
            case "addition":
                if($leftType == "IntegerType" && $rightType == "IntegerType" && $binConstraint->root == "false") {
                    $leftValue = (int) $left->value;
                    $rightValue = (int) $right->value;
                    $obj->value = $leftValue + $rightValue;
                    $obj->type = "IntegerType";
                    return $obj;
                }
                $obj->name = "Case addition: leftType: " . $leftType . " rightType: " . $rightType . " root: " . $binConstraint->root;
                $obj->value = false;
                $obj->type = "BooleanType";
                return $obj;
            case "multiplication":
                if($leftType == "IntegerType" && $rightType == "IntegerType" && $binConstraint->root == "false") {
                    $leftValue = (int) $left->value;
                    $rightValue = (int) $right->value;
                    $obj->value = $leftValue * $rightValue;
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
                if($leftType == "BooleanType" && $rightType == "BooleanType") {
                    $obj->value = $this->boolval($left->value) || $this->boolval($right->value);
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
        $leftType = $this->getExpr($unaryConstraint->expression)["type"];
        $obj = new stdClass();
        $obj->name = "";
        switch($leftType) {
            case "BinaryConstraint" :
                $res = $this->validateBinary($left);
                if($this->boolval($res->value))
                    $res->value = false;
                else
                    $res->value = true;
                $obj->value = $res->value;
                $obj->type = "BooleanType";
                return $obj;
            case "UnaryConstraint" :
                $res = $this->validateUnary($left);
                if($this->boolval($res->value))
                    $res->value = false;
                else
                    $res->value = true;
                $obj->value = $res->value;
                $obj->type = "BooleanType";
                return $obj;
            case "BooleanType" :
                if($this->boolval($left->value) == false) {
                    $left->value = true;
                }
                else
                    $left->value = false;
                $obj->value = $left->value;
                $obj->type = "BooleanType";
                return $obj;
        }
        echo"<h1>validateUnary method failed...  LeftType was: $leftType </h1>";
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

                    if ($this->boolval($value) !== null) {
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
        if(strcmp($in, 'false') == 0 || $in == false)
            return false;
        if(strcmp($in, 'true') == 0 || $in == true)
            return true;
        echo "<h1>Boolval failed.... </h1>";
        return $res;
    }

}

?>