<?php
// Variables globales
$meses = [
    "Enero",
    "Febrero",
    "Marzo",
    "Abril",
    "Mayo",
    "Junio",
    "Julio",
    "Agosto",
    "Septiembre",
    "Octubre",
    "Noviembre",
    "Diciembre"
];

if ((isset($_GET["mes"])) && (isset($_GET["año"]))) {
    $mes=$_GET["mes"];
    $año=$_GET["año"];
}else{
    $mes=date("m");
    $año=date("Y");
}

?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calendario</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>

<div class="calendario">

    <div class="calendario-header">
        <button class="nav-btn" onclick= 'mesAnterior(<?= $mes?>, <?=$año?>)'>&#10094;</button>

        <h2><?=$meses[$mes-1]?> <?=$año?></h2>

        <button class="nav-btn" onclick= 'mesSiguiente(<?= $mes?>, <?=$año?>)'>&#10095;</button>
    </div>

    <div class="calendario-grid">

        <!-- Días de la semana -->
        <div class="dia-nombre">Lun</div>
        <div class="dia-nombre">Mar</div>
        <div class="dia-nombre">Mié</div>
        <div class="dia-nombre">Jue</div>
        <div class="dia-nombre">Vie</div>
        <div class="dia-nombre">Sáb</div>
        <div class="dia-nombre">Dom</div>

        <!-- Días vacíos antes del día 1 -->
        <?php
            $huecos=date("N",mktime(0,0,0,$mes,1,$año))-1;
            for($i=1; $i<$huecos;$i++){
                echo "<div class='dia vacio'></div>";
            }
            
            $dias=date("t",mktime(0,0,0,$mes,1,$año));
            for($dia=1;$dia<=$dias;$dia++){
                echo "<div class='dia'>$dia</div>";
            }
            
            $huecos = 7-date("N",mktime(0,0,0,$mes,$dias,$año));
            echo $huecos+1;
            for($i=0; $i < $huecos; $i++){
                echo "<div class='dia vacio'></div>";
            }

            
        ?>
        
    </div>

</div>

</body>
<script>
function mesAnterior(mes,año) {

  let nuevoMes = mes;
  let nuevoAño = año;

  if(mes == 1){
    nuevoMes = 12;
    nuevoAño--;
}else{
    nuevoMes = mes-1;
}
const url = `http://localhost/03_php/calendario/calendario.php?mes=${nuevoMes}&año=${nuevoAño}`;
  
  window.location = url;
}

function mesSiguiente(mes,año) {

  let nuevoMes = mes;
  let nuevoAño = año;
  if(mes==12){
    nuevoMes = 1;
    nuevoAño++;
}else{
    nuevoMes = mes+1;
}
const url = `http://localhost/03_php/calendario/calendario.php?mes=${nuevoMes}&año=${nuevoAño}`;
  
  window.location = url;
}


</script>
</html>