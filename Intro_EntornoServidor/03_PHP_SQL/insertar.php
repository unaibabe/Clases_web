<?php

include "conexion.php";

$nombre = $_POST["nombre"];
$correo = $_POST["correo"];

$stmt = $conexion->prepare("INSERT INTO usuario (usuario,email) VALUES (?,?)");

// Asocia las variables a los parametros.
//bind_param para crear query sql
// ss -> indica el tipo de datos de cara variable siendo S string
$stmt->bind_param("ss", $nombre, $correo);

// Reemplaza tu bloque IF por este:
if ($stmt->execute()) {
    echo "Usuario registrado correctamente";
} else {
    echo "Error al registrar usuario: " . $stmt->error;
}


// cerrrar conexion
$stmt->close();
$conexion->close();
