<?php
    print_r($_POST);
    
    if(!isset( $_POST["id"])){
        echo "<h3>No se puede editar, faltan datos</h3>";
        die();
    }
    $id = $_POST["id"];
    

    if(!isset($_POST["disponible"])){
        $disponible = 0;
    }  else{
        $disponible = 1;
    }

    


    
?>