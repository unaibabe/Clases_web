<?php
    try {
        $conexion=new mysqli("localhost","root","","empresa");
        $conexion->set_charset("utf8");
    } catch (mysqli_sql_exception $error) {
        echo "<p>No se pudo conectar con la BBDD.</p>";
        exit(0);
    }
?>