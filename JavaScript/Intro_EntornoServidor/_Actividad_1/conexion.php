<?php

// Conexion con la bbdd
$host = "localhost";
$user = "root";
$pasword = "";
$base_datos = "restaurante_carlos";

$conexion = new mysqli($host, $user, $pasword, $base_datos);

if ($conexion->error) {
    die("Error al establecer la conexion" . $conexion->error);
}
$conexion->set_charset("utf8");
