<?php
// Configuración de las credenciales de tu base de datos
$host     = "localhost";
$usuario  = "tu_usuario_bd";
$password = "tu_contraseña_bd";
$base_datos = "nombre_de_tu_base_de_datos";

// Crear la conexión usando MySQLi (Orientado a Objetos)
$conexion = new mysqli($host, $usuario, $password, $base_datos);

// Verificar si la conexión falló
if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}

// Configurar el conjunto de caracteres a UTF-8 para evitar problemas con tildes o "ñ"
$conexion->set_charset("utf8");
