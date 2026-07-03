<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Proceso de alta...</title>
<body>

<?php 

if (($_SERVER['REQUEST_METHOD']=="POST") &&
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
    
    echo $codigo."<br/>".$nombre."<br/>".$apellidos."<br/>".$alta."<br/>".$fechaNacimiento;
       
    
} else {
    echo "<h3>Solicitud no válida</h3>";
}



?>
<a href="formulario_alta.html">Nuevo contacto</a><br>
<a href="listado.php">Ir a listado</a>

</body>
</html>