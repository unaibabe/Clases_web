<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Actualizar de Contactos</title>
</head>
<body>

<?php 
if (!isset($_GET["nombre"]) || !isset($_GET["apellidos"])) {
    echo "<h3>No hay datos para actualizar</h3>"; 
    
} else {
        
        $nombre = $_GET["nombre"];
        $apellidos = $_GET["apellidos"];    
        
        include ('accesoBBDD.php');
        $sql = "SELECT * FROM contactos WHERE nombre LIKE ? AND apellidos LIKE ?";
        $consulta = $conexion->prepare($sql);
        $consulta->bind_param("ss", $nombre, $apellidos);
        
        try {
            if ($consulta->execute()) {
                $resultado = $consulta->get_result();
                $contacto = $resultado->fetch_assoc();
                
                
                ?>
                    <h1>Actualizar Contactos</h1>
                    <form action="editar.php" method="POST">

                    <!-- CORRECCIÓN EXTRA: Guardamos los valores originales ocultos para el WHERE del archivo actualizar.php -->
                    <input type="hidden" name="nombre_original" value="<?= $nombre ?>">
                    <input type="hidden" name="apellidos_original" value="<?= $apellidos ?>">

                    <p>
                        <label for="codigo">Código: </label>
                        <input type="number" name="codigo" value="<?= $contacto["codigo"] ?>">
                    </p>
                    <p>
                        <label for="nombre">Nombre: </label>
                        <input type="text" name="nombre" maxlength="50" required value='<?= $contacto["nombre"] ?>'>
                    </p>
                    <p>
                        <label for="apellidos">Apellidos: </label>
                        <input type="text" name="apellidos" maxlength="60" required value='<?= $contacto["apellidos"] ?>'>
                    </p>
                    <p>
                        <input type="checkbox" name="alta" value="1" <?= $contacto["altas"] == 1 ? "checked" : "" ?>>
                        <label for="alta">Está dado de alta</label>
                    </p>
                    <p>
                        <label for="fechaNacimiento">Fecha de nacimiento: </label>
                        <input type="date" name="fechaNacimiento" value="<?= $contacto["fechaNacimiento"] ?>">
                    </p>
                    <input type="submit" value="ACTUALIZAR">
                    </form>
                <?php              
                
                
            } else {
                echo "<h3>Error al recuperar contacto</h3>";
                echo "<h4>Error: ".$consulta->error."</h4>";
            }
        } catch (mysqli_sql_exception $error) {
            echo "<h3>Error al recuperar contacto: ".$error->getMessage()."</h3>";
        }
        
    } 

?>
</body>
</html>
