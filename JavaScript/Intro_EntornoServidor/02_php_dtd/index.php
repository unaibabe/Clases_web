<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    // Declarar variable para tomar los datos del fichero datos.xml
    $xml = simplexml_load_file("datos.xml");
    
    // Bucle o iteracion que recorra y muestre los datos del fichero xml
    foreach($xml->persona as $persona){
        $codigo = $persona["codigo"];
        $nombre = $persona->nombre;
        $edad = $persona->edad;
        echo "$nombre tiene $edad años. Su codigo es $codigo.<br>";
    }
    ?>
</body>

</html>