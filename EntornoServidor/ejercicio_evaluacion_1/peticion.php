<?php
    include("accesoBBDD.php");
    // var_dump($_SERVER);
    if($_SERVER["REQUEST_METHOD"] == "POST"){
        // echo "ENVIADO CON POST";
        if(empty($_POST)){
            echo "POST sin datos";
        } else{

            if(isset($_POST["consulta"]) 
                && $_POST["categoria"])
            {
                $campo_consulta = $_POST["consulta"];
                $nombre_categoria = $_POST["categoria"];

                $sql = "SELECT * FROM `categorias` WHERE NombreDeCategoria = ?";
                $consulta = $conexion->prepare($sql);
                $consulta->bind_param("s", $campo_consulta);
                $consulta->execute();
                $resultado = $consulta->get_result();

                if($resultado->num_rows == 0){
                    echo "categoría no encontrada";
                }else{
                    while($producto=$resultado->fetch_assoc()){
                        try{
                            echo $producto[$nombre_categoria];
                        } catch(ErrorException $e) {
                            echo "Error al elegir el tipo de la consulta". $e->getMessage();
                        }                
                    }
            }

            } else {
                    echo "Datos no encontrados";
                }
            // echo $campo_consulta;
            // echo $nombre_categoria;

            
            

            // Esto traduce cualquier Warning/Notice en una Excepción que el try-catch sí entiende
            // set_error_handler(function($nivel, $mensaje, $archivo, $linea) {
            //     throw new ErrorException($mensaje, 0, $nivel, $archivo, $linea);
            // });

            
        }
    }
    else if($_SERVER["REQUEST_METHOD"] == "GET"){
        // echo "ENVIADO CON GET";
        if(empty($_GET)){
            echo "sin datos";
        } else{
            
            // var_dump($_GET);
            $campo_consulta = $_GET["consulta"];
            $nombre_categoria = $_GET["categoria"];
            // echo $nombre_categoria;

            
            $sql = "SELECT * FROM `categorias` WHERE NombreDeCategoria = ?";
            $consulta = $conexion->prepare($sql);
            $consulta->bind_param("s", $nombre_categoria);
            $consulta->execute();
            $resultado = $consulta->get_result();

            if($resultado->num_rows == 0){
                echo "categoría no encontrada";
                }
                
            $lista = [];
            while($producto=$resultado->fetch_assoc()){
                // print_r($producto);
                // $lista[] = $producto["IdCategoria"];
                // $lista[] = $producto["Descripcion"];
                // $lista[] = $producto["ProductoBasico"];
                // $lista[] = $producto["NombreDeCategoria"];
                echo $producto[$campo_consulta];

            }
            // var_dump( $lista);
            // echo $lista["Descripcion"];


        }
    }
?>