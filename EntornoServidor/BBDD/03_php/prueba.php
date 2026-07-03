<?php

echo "Esto funciona ok <br>";

$numero = 5;
$texto  ="nombre";

echo "numero: $numero y  texto: $texto";

?>


<hr>
<?php 

for($i =0; $i<10; $i++){
    echo $i;?>
    <br>
    
<?php }?>

<hr>
<?php 
for($i =1; $i<=10; $i++){?>
    <button onclick="alert('Soy el boton <?php echo $i?>')">BOTON <?php echo $i?></button>
    
<?php }?>
<?php 
for($i=10; $i>1; $i--){
    echo "$i <br>";
    
}

?>
<hr>
<?php 
    $coleccion = [43,32,5623,560];
    foreach ($coleccion as $numero){
        echo "$numero <br>";
    }
?>
<hr>

<?php 
    $coleccion= ["Juan"=>42,"Yolanda"=>13];
    $indices = array_keys($coleccion);
    $valores = array_values($coleccion);
    
    foreach ($indices as $indice){
        echo "$indice <br>";
    }
    foreach ($valores as $valor){
        echo "$valor <br>";
    }
?>

