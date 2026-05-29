<?php
include "conexion.php";

$nombre = $_POST["nombre"];
$apellido = $_POST["apellido"];

$email = $_POST["email"];
$telefono = $_POST["telefono"];
$fecha = $_POST["fecha"];
$numero_personas = $_POST["numero-personas"];
$turno = $_POST["turno"];
$newsletter = isset($_POST["newsletter"]) ? 1 : 0;



$stml = $conexion->prepare("INSERT INTO reserva(nombre,apellido,email,telefono,fecha,numero_personas,turno_reserva,newsletter) VALUES(?,?,?,?,?,?,?,?)");

$stml->bind_param("sssssisi", $nombre, $apellido, $email, $telefono, $fecha, $numero_personas, $turno, $newsletter);

if ($stml->execute()) {
    echo "Usuario registrado correctamente";
} else {
    echo "Error al registrar usuario" . $stml->error;
}

$stml->close();
$conexion->close();
