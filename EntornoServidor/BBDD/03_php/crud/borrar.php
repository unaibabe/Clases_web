<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceso de borrado...</title>
<body>

<?php 

if (($_SERVER['REQUEST_METHOD']=="GET") &&
    (isset($_GET["nombre"])) &&
    (isset($_GET["apellidos"]))) {
    

    $nombre=$_GET["nombre"];
    $apellidos=$_GET["apellidos"];
    
    include ('accesoBBDD.php');
    $sql = "DELETE FROM contactos WHERE nombre LIKE ? AND apellidos LIKE ?";
    
    $consulta=$conexion->prepare($sql);
    $consulta->bind_param("ss",$nombre,$apellidos);
    
    try {
        if ($consulta->execute()) {
            echo "<h3>Contacto borrado correctamente.</h3>";
        } else {
            echo "<h3>No se ha podido borrar al contacto</h3>";
            echo "<h4>Error: ".$consulta->error."</h4>";
        }
    } catch (mysqli_sql_exception $error) {
        echo "<h3>No se pudo borrar al contacto: ".$error->getMessage()."</h3>";
    }
    
    } else {
        echo "<h3>Solicitud no válida</h3>";
    }
    
   // echo $codigo."<br/>".$nombre."<br/>".$apellidos."<br/>".$alta."<br/>".$fechaNacimiento;
       
    




?>
<a href="formulario_alta.html">Nuevo contacto</a><br>
<a href="listado.php">Ir a listado</a>

</body>
</html>