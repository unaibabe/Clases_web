<?php 
    $peticion = file_get_contents("php://input");

    $json = json_decode($peticion);
    $autor = $json->autor;
    $isbn = $json->isbn;



    include("accesoBBDD.php");

    $sql = "DELETE FROM libros WHERE autor LIKE ? AND isbn = ?;";
    $consulta = $conexion->prepare($sql);
    $consulta->bind_param("ss", $autor, $isbn);
    $consulta->execute();


?>