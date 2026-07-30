<?php

    if($_SERVER["REQUEST_METHOD"] == "POST"){

        $json = file_get_contents("php://input");
        $datos = json_decode($json,true);
        header("Content-Type: application/json");

        if(empty($json)){
            $respuesta = ["respuesta"=>"No se han recibido datos por POST"];
        }else{
            $datos["numero"]=str_replace(",",".",$datos["numero"]);
            $numero = floatval($datos["numero"]);
            $numero *= 2;
            $respuesta = ["respuesta"=>$numero];
        }

        
    }else{
        $respuesta =["respuesta"=>"Peticion incompatible con la api porfa usa POST"]; 
    }

    echo json_encode($respuesta);


?>