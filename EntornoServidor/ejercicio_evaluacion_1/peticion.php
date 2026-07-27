<?php
    include("accesoBBDD.php");
    // var_dump($_SERVER);
    if($_SERVER["REQUEST_METHOD"] == "POST"){
        echo "ENVIADO CON POST";
        if(empty($_POST)){
            echo "POST sin datos";
        } else{
            var_dump($_POST);
        }
    }else if($_SERVER["REQUEST_METHOD"] == "GET"){
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