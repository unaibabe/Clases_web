<?php
// Datos de conexión a la base de datos
$servidor = "localhost"; 
$usuario = "dgt"; 
$clave = "Dirección General de Tráfico*1"; 
$bbdd = "radar";

// Datos del vehículo
$matricula = "0000 BBB";
$velocidad = 120.5;
$limite_velocidad = 100.0;
$fecha = date("Y-m-d H:i:s"); // Fecha y hora actuales

// Crear conexión
$conexion = new mysqli($servidor, $usuario, $clave, $bbdd);

// Verificar la conexión
if ($conexion->connect_error) {
    die("Conexión fallida: " . $conexion->connect_error);
}

// Preparar y ejecutar la consulta SQL
$sql = "INSERT INTO vehiculos_sancionados (matricula, velocidad, limite_velocidad, fecha)
        VALUES (?, ?, ?, ?)";

$consulta = $conexion->prepare($sql);
$consulta->bind_param("sdds", $matricula, $velocidad, $limite_velocidad, $fecha);

if ($consulta->execute()) {
    echo "Registro insertado exitosamente.";
} else {
    echo "Error: " . $consulta->error;
}

// Cerrar la conexión
$consulta->close();
$conexion->close();
?>
