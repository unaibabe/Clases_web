<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceso de actualizar...</title>
<body>

<?php
    //print_r ($_POST);
if (($_SERVER['REQUEST_METHOD']=="POST") &&
    (isset($_POST["codigo"])) &&
    (isset($_POST["nombre"])) &&
    (isset($_POST["apellidos"])) &&
    (isset($_POST["nombreOriginal"])) &&
    (isset($_POST["apellidosOriginal"])) &&
    (isset($_POST["fechaNacimiento"])) &&
    (isset($_POST["nombrecentro"]))) {
    
    $nombreOriginal=$_POST["nombreOriginal"];
    $apellidosOriginal=$_POST["apellidosOriginal"];
    $codigo=$_POST["codigo"];
    $nombre=$_POST["nombre"];
    $apellidos=$_POST["apellidos"];
    if (isset($_POST["alta"])) {
        $alta=true;
    } else {
        $alta=false;
    }
    $fechaNacimiento=$_POST["fechaNacimiento"];
    $centro=$_POST["nombrecentro"];
        // AÑADE ESTO AQUÍ:
    if ($centro === "") {
        $centro = null;
    }

    include("accesoBBDD.php");

    include("accesoBBDD.php");
    
    $sql="UPDATE contactos SET codigo=?,nombre=?,apellidos=?,altas=?,fechaNacimiento=?,centro=? WHERE nombre LIKE ? AND apellidos LIKE ?";
    $consulta=$conexion->prepare($sql);
    $consulta->bind_param("issisiss",$codigo,$nombre,$apellidos,$alta,$fechaNacimiento,$centro,$nombreOriginal,$apellidosOriginal);
    
    try {
        if ($consulta->execute()) {
            echo "<h3>Contacto actualizado correctamente.</h3>";
        } else {
            echo "<h3>No se ha podido actualizar el contacto</h3>";
            echo "<h4>Error: ".$consulta->error."</h4>";
        }
    } catch (mysqli_sql_exception $error) {
        echo "<h3>No se ha podido actualizar el contacto: ".$error->getMessage()."</h3>";
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