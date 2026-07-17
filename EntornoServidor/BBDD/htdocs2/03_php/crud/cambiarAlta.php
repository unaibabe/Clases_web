<?php 

try{
    $peticion = file_get_contents("php://input");
    $json = json_decode($peticion);
    $nombre = $json->nombre;
    $apellido = $json->apellidos;
    $altas = $json->altas;
    
    include("accesoBBDD");
    
    $sql = "UPDATE contactos SET altas=? WHERE nombre = ? AND apellido = ?";
    $consulta = $conexion->prepare($sql);
    $consulta->bind_param("iss",$alta,$nombre,$apellido);
    
    $consulta->execute();
    
    $consulta->close();
    $conexion->close();
    
}


catch(Exception $error){
    
    echo "{'error':'No se pudo actualizar'}";
}

?>