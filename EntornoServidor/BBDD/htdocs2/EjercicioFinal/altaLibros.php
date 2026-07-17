<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alta libro</title>
</head>
<body>
    <?php
        if($_SERVER["REQUEST_METHOD"]=="POST"){
            $titulo = $_POST["titulo"];
            $autor = $_POST["autor"];
            $isbn = $_POST["isbn"];
            $imagen = $_FILES["imagen"]["name"];
            $disponible = isset($_POST["disponible"]) ? 1 : 0;

            include("accesoBBDD.php");

            $sql = "INSERT INTO libros(titulo,autor,isbn,imagen,disponible) VALUES (?,?,?,?,?)";
            $consulta = $conexion->prepare($sql);
            $consulta->bind_param("ssssi",$titulo,$autor,$isbn,$imagen,$disponible);

            try{
                if($consulta->execute()){
                    echo "<script>
                            alert('El libro se ha registrado correctamente');
                            window.location.href = 'listadoLibros.php';
                        </script>";
                }else{
                    echo "<script>alert('Error al registrar el libro.');</script>";
                }
            } catch (mysqli_sql_exception $error) {
            echo "<h3>No se pudo dar de alta al contacto: ".$error->getMessage()."</h3>";
        }
            $consulta->close();
            $conexion->close();
        }else{
            echo "<h3>Solicitud no valida</h3>";
        }
        
    
    ?>

</body>
</html>