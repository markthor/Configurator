<?php

$file_location = "engine3.json";

$json = file_get_contents($file_location);
$data = json_decode($json);

require_once("validator.php");

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $validator = new validator($json, $_POST);
    if($validator->validate())
        echo'<h2>HUZZAH! All constraints validated. The crowd goes wild!</h2>';
    else{
        echo'<h2>Some constraints failed. I will however not tell you which ones ^_^</h2>';
    }
}

?>

<html>
<form method="POST">
    <?php if(isset($data->root->expressions->parameter)): ?>
        <?php foreach($data->root->expressions->parameter as $param): ?>
            <?php
            switch ($param->type) {
                case "IntegerType":
                    echo ''. $param->name .' ('. $param->type .') : <input type="text" name="'. $param->name .'" placeholder="'. $param->name .'"> <br/>';
                    break;
                case "BooleanType":
                    echo ' '.$param->name.' ('.$param->type.') :
                        <select name="'.$param->name.'" >';
                            echo'<option value="true">true</option>';
                            echo '<option value="false">false</option>';
                    echo'
                        </select>
                        <br/>';
                    break;
                case "StringType":
                    echo ' '.$param->name.' ('.$param->type.') : <input type="text" name="'.$param->name.'" placeholder="'.$param->name.'"> <br/>';
                    break;
            }
            ?>

            <br />
            <hr />
            <br />
        <?php endforeach; ?>
    <?php endif; ?>
    <input type="submit" value="Validate">
</form>
</html>