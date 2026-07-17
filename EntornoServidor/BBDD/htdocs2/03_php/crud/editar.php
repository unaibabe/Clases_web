<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceso de editar...</title>
</head>
<body>

<?php 

if (($_SERVER['REQUEST_METHOD'] == "POST") &&
    (isset($_POST["codigo"])) &&
    (isset($_POST["nombre"])) &&
    (isset($_POST["apellidos"])) &&
    (isset($_POST["fechaNacimiento"]))) {
    
    $codigo=$_POST["codigo"];
    $nombre=$_POST["nombre"];
    $apellidos=$_POST["apellidos"];
    
    if (isset($_POST["alta"])) {
        $alta=true;
    } else {
        $alta=false;
    }
    $fechaNacimiento=$_POST["fechaNacimiento"];
    $nombre_original = $_POST["nombre_original"];
    $apellidos_original = $_POST["apellidos_original"];
    
    include ('accesoBBDD.php');
    $sql = "UPDATE contactos SET codigo= ?, nombre = ?, apellidos = ?,altas=?, fechaNacimiento = ?  WHERE nombre=? AND apellidos=?;";
    $consulta=$conexion->prepare($sql);
    $consulta->bind_param("ississs",$codigo,$nombre,$apellidos,$alta,$fechaNacimiento,$nombre_original,$apellidos_original);
    
    try {
        if ($consulta->execute()) {
            echo "<h3>Contacto EDITADO correctamente.</h3>";
        } else {
            echo "<h3>No se ha podido EDITAR al contacto</h3>";
            echo "<h4>Error: ".$consulta->error."</h4>";
        }
    } catch (mysqli_sql_exception $error) {
        echo "<h3>No se pudo EDITAR al contacto: ".$error->getMessage()."</h3>";
    }
    
    } else {
        echo "<h3>Solicitud no válida</h3>";
    }
       



?>
<a href="formulario_alta.html">Nuevo contacto</a><br>
<a href="listado.php">Ir a listado</a>

</body>
</html>