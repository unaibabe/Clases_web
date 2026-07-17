<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Actualizar de Contactos</title>
</head>
<body>

<?php 
if (($_SERVER['REQUEST_METHOD']=="GET") &&
    (isset($_GET["codigo"])) &&
    (isset($_GET["nombre"])) &&
    (isset($_GET["apellidos"])) &&
    (isset($_GET["fechaNacimiento"]))) {
        
        $codigo=$_GET["codigo"];
        $nombre=$_GET["nombre"];
        $apellidos=$_GET["apellidos"];
        if (isset($_GET["altas"])) {
            $alta=true;
        } else {
            $alta=false;
        }
        $fechaNacimiento=$_GET["fechaNacimiento"];
 
        
        //echo $codigo."<br/>".$nombre."<br/>".$apellidos."<br/>".$alta."<br/>".$fechaNacimiento;
        
        
    } else {
        echo "<h3>Solicitud no válida</h3>";
    }
?>

<h1>Actualizar Contactos</h1>
<form action="editar.php" method="POST">
<!-- Guardamos los valores originales para el WHERE -->
<input type="hidden" name="nombre_original" value="<?= $_GET['nombre'] ?>">
<input type="hidden" name="apellidos_original" value="<?= $_GET['apellidos'] ?>">

<p>
	<label for="codigo">Código: </label>
	<input type="number" name="codigo" value=<?= $codigo?>>
</p>
<p>
	<label for="nombre">Nombre: </label>
	<input type="text" name="nombre" maxlength="50" required value = '<?= $nombre?>'>
</p>
<p>
	<label for="apellidos">Apellidos: </label>
	<input type="text" name="apellidos" maxlength="60" required value = '<?= $apellidos?>'>
</p>
<p>
	<input type="checkbox" name="alta" <?php echo $alta ? "checked" : ""; ?>>
	
	<label for="alta">Está dado de alta</label>
</p>
<p>
	<label for="fechaNacimiento">Fecha de nacimiento: </label>
	<input type="date" name="fechaNacimiento" value= <?= $fechaNacimiento?>>
</p>
<input type="submit" value="ACTUALIZAR">
</form>

</body>
</html>