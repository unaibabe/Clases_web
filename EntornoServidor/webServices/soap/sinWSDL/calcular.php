<?php
    function sumar($num1,$num2){
        return $num1 + $num2;
    }
    function restar($num1,$num2){
        return $num1 - $num2;
    }
    
    function invertirString($cadena){
        $respuesta = "";
        for($i=strlen($cadena)-1; $i>= 0; $i--){
            $respuesta .= $cadena[$i];  
        }
        return $respuesta;
    }

    function sumatorio($numero)
    {
        if($numero==0){
            return 0;
        }else{
            return $numero + sumatorio($numero-1);
        }
               
    }
    function capicua($numero){
        for($i=$numero;$i>=0;$i--){
            $numeroStr = strval($i);
            $respuesta = "";

            for($j=strlen($numeroStr)-1; $j>=0; $j--){
                $respuesta .= $numeroStr[$j];
            }

            if($respuesta == $numeroStr){
                echo $i." Es capicua</br>";
            
            }
        }
    }

    $url = "http://localhost/soap/sinWSDL/calcular.php";
    $uri="http://localhost/soap/sinWSDL/calcular.php";//Si te equivocas funciona, habitualmente es el mismo

    $servidor = new SoapServer(null,["location"=>$url,"uri"=>$uri]);

    $servidor->addFunction("sumar");
    $servidor->addFunction("restar");

    $servidor->handle();
?>