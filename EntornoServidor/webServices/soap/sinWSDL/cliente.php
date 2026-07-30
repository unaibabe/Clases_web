<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cliente</title>
</head>
<body>
    <form action="" method="post" target="cliente.php">
        <fieldset>
            Numero 1: <input type="text" name="num1"><br>
            Numero 2: <input type="text" name="num2"><br>
            <input type="submit" value="Sumar" name="sumar">
            <input type="submit" value="Restar" name="restar">
        </fieldset>
    </form>
</body>
</html>

<?php
    // var_dump($_POST);
    if ((isset($_POST["sumar"])) || (isset($_POST["restar"]))) {
        $url = "http://localhost/soap/sinWSDL/calcular.php";
        $uri="http://localhost/soap/sinWSDL/calcular.php";
        $cliente = new SoapClient(null,["location"=>$url,"uri"=>$uri, "trace"=>1]);

        $num1 = $_POST["num1"];
        $num2 = $_POST["num2"];

        if (isset($_POST["sumar"])){
            echo "La suma del numero $num1 y $num2 es: ". $cliente->sumar($num1, $num2);
        }
        else if (isset($_POST["restar"])){
            echo "La resta del numero $num1 y $num2 es: ". $cliente->restar($num1, $num2);
        }

        
    } 
    
    
    

?>