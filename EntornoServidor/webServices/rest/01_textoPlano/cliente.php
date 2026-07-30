<?php

    $url = "http://localhost/rest/01_textoPlano/doblar.php";
    $numero = 50;
    $peticion = curl_init($url);
    curl_setopt($peticion, CURLOPT_POST, true);
    curl_setopt($peticion, CURLOPT_POSTFIELDS, $numero);
    curl_setopt($peticion, CURLOPT_RETURNTRANSFER, true);

    $respuesta = curl_exec($peticion);
    if($respuesta){
        echo "Respuesta del webService: ".$respuesta;
    }else{
        echo "Error en la peticion del webService".curl_error($peticion);
    }


?>