<?php

try {
    // Capturamos el contenido de la petición
    $peticion=file_get_contents("php://input");
    // Transformamos el contenido JSON en un objeto
    $json=json_decode($peticion);
    // Ahora recuperamos cada campo por separado
    $nombre=$json->nombre;
    $apellidos=$json->apellidos;
    
    include("accesoBBDD.php");
    
    $sql="DELETE FROM contactos WHERE nombre LIKE ? AND apellidos LIKE ?;";
    $consulta=$conexion->prepare($sql);
    $consulta->bind_param("ss",$nombre,$apellidos);
    $consulta->execute();
    
    $consulta->close();
    $conexion->close();
    
} catch (Exception $error) {
    echo "{'error':'No se pudo borrar'}";
}

?>