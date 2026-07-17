<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceso de borrado...</title>
<body>

<?php 

if (($_SERVER['REQUEST_METHOD']=="GET")) {

    include("accesoBBDD.php");
    
    $sql="DELETE FROM contactos";
    $consulta=$conexion->prepare($sql);
    
    try {
        if ($consulta->execute()) {
            echo "<h3>TODOS los contactos borrados correctamente.</h3>";
        } else {
            echo "<h3>No se han podido borrar los contactos</h3>";
            echo "<h4>Error: ".$consulta->error."</h4>";
        }
    } catch (mysqli_sql_exception $error) {
        echo "<h3>No se han podido borrar los contactos: ".$error->getMessage()."</h3>";
    }
    
    $consulta->close();
    $conexion->close();
    
} else {
    echo "<h3>Solicitud no válida</h3>";
}

?>

<a href="formulario_alta.html">Nuevo contacto</a>&nbsp;&nbsp;&nbsp;
<a href="listado.php">Ir al listado</a>


</body>
</html>