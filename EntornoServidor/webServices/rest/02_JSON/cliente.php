<?php

    $url = "http://localhost/rest/02_JSON/doblar.php";
    $numero = 58;
    $json = json_encode(["numero"=>$numero]);

    $opciones = [
        "http"=> [
             "method"=>"POST",
             "header"=> "Content-Type: application/json",
             "content"=> $json
        ]

    ];
    $contexto = stream_context_create($opciones);

    $respuesta = file_get_contents($url, false, $contexto);
    if($respuesta){
        $json = json_decode($respuesta, true);
        $jsonObj = json_decode($respuesta, flase);// Seria un objeto al ser false
        echo $jsonObj->respuesta;
        echo "Respuesta del webService: ". $respuesta . ". Como texto</br>";
        echo "Respuesta del webService: ". $json["respuesta"] . " como objeto. ";
    }else{
        echo "Error en la peticion del webService";
    }

    $x = json_encode("'valor:3',doble:()=>{valor*2}")

?>