<?php

    if($_SERVER["REQUEST_METHOD"] == "POST"){

        $json = file_get_contents("php://input");
        $datos = json_decode($json,true);
        header("Content-Type: application/json");

        if(empty($datos)){
            echo "No se han recibido datos";
        }else{
            $datos=str_replace(",",".",$datos);
            $numero = floatval($datos);
            $numero *= 2;
            echo $numero; 
        }

        
    }else{
        echo "Peticion incompatible con la api porfa usa POST";
    }


?>