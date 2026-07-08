<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Alta de Contactos</title>
</head>
<body>

<?php 

if ($_SERVER["REQUEST_METHOD"]=="GET") {

?>
<h1>Alta de Contactos</h1>
<form action="formulario_alta.php" method="POST">

<p>
	<label for="codigo">Código: </label>
	<input type="number" name="codigo" required>
</p>
<p>
	<label for="nombre">Nombre: </label>
	<input type="text" name="nombre" maxlength="50" required>
</p>
<p>
	<label for="apellidos">Apellidos: </label>
	<input type="text" name="apellidos" maxlength="60" required>
</p>
<p>
	<input type="checkbox" name="alta">
	<label for="alta">Está dado de alta</label>
</p>
<p>
	<label for="fechaNacimiento">Fecha de nacimiento: </label>
	<input type="date" name="fechaNacimiento">
</p>
<p>
    <label for="nombrecentro">Nombre Centro</label>
    <select name="nombrecentro" >
        <?php
            include("accesoBBDD.php");
            $sql = "SELECT codigo,nombre FROM centrotrabajo;";
            $consulta = $conexion->prepare($sql);
            try{
                if($consulta->execute()){
                    for($i=0;$i<$consulta["nombre"].len;$i++){
                        echo "<option";
                    }
                }
            }
            catch (mysqli_sql_exception $error) {
            echo "<h3>No se pudo dar de alta al contacto: ".$error->getMessage()."</h3>";
        }

        
        ?>


        <option value="1-barcelona">Barcelona</option>
    </select>
</p>
<input type="submit" value="ENVIAR">
</form>

<?php } elseif (($_SERVER['REQUEST_METHOD']=="POST") &&
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
        
        include("accesoBBDD.php");
        
        $sql="INSERT INTO contactos (codigo,nombre,apellidos,alta,fechaNacimiento) VALUES (?,?,?,?,?)";
        $consulta=$conexion->prepare($sql);
        $consulta->bind_param("issis",$codigo,$nombre,$apellidos,$alta,$fechaNacimiento);
        
        try {
            if ($consulta->execute()) {
                echo "<h3>Contacto dado de alta correctamente.</h3>";
            } else {
                echo "<h3>No se ha podido dar de alta al contacto</h3>";
                echo "<h4>Error: ".$consulta->error."</h4>";
            }
        } catch (mysqli_sql_exception $error) {
            echo "<h3>No se pudo dar de alta al contacto: ".$error->getMessage()."</h3>";
        }
        
        $consulta->close();
        $conexion->close();
        
} else {
    echo "<h3>Solicitud no válida</h3>";
}
    
?>

<a href="formulario_alta.php">Nuevo contacto</a>&nbsp;&nbsp;&nbsp;
<a href="listado.php">Ir al listado</a>

</body>
</html>