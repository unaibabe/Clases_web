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
$mes=date("m");
$año=date("Y");

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
        <button class="nav-btn">&#10094;</button>

        <h2>
        <?php
        if ((isset($_GET["mes"])) && (isset($_GET["año"]))) {
            $mes=$_GET["mes"];
            $año=$_GET["año"];
        }
        ?>
        <?=$meses[$mes-1]?> <?=$año?></h2>

        <button class="nav-btn">&#10095;</button>
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
        <?php echo date("N",mktime(0,0,0,$mes,1,$año));?>
        
        <div class="dia vacio"></div>
        <div class="dia vacio"></div>

        <!-- Días del mes -->
        <div class="dia">1</div>
        <div class="dia">2</div>
        <div class="dia">3</div>
        <div class="dia">4</div>
        <div class="dia">5</div>

        <div class="dia">6</div>
        <div class="dia">7</div>
        <div class="dia">8</div>
        <div class="dia">9</div>
        <div class="dia">10</div>
        <div class="dia">11</div>
        <div class="dia">12</div>

        <div class="dia">13</div>
        <div class="dia">14</div>
        <div class="dia">15</div>
        <div class="dia">16</div>
        <div class="dia">17</div>
        <div class="dia">18</div>
        <div class="dia">19</div>

        <div class="dia">20</div>
        <div class="dia">21</div>
        <div class="dia">22</div>
        <div class="dia">23</div>
        <div class="dia">24</div>
        <div class="dia">25</div>
        <div class="dia">26</div>

        <div class="dia">27</div>
        <div class="dia">28</div>
        <div class="dia">29</div>
        <div class="dia">30</div>
        <div class="dia">31</div>

        <!-- Vacíos para completar la última fila -->
        <div class="dia vacio"></div>
        <div class="dia vacio"></div>

    </div>

</div>

</body>
</html>