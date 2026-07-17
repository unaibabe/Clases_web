<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Academia</title>
    <style>
      body {
        background-color: #121212;
        color: #ffffff;
        font-family: sans-serif;
        margin: 0;
        padding: 20px;
      }
      .cards {
        width: 90%;
        max-width: 1200px;
        margin: 0 auto;
        display: flex;
        flex-wrap: wrap;
        gap: 20px;
        justify-content: center;
      }
      .tarjeta {
        background-color: #1e1e1e;
        border-radius: 10px;
        width: calc(33.333% - 20px);
        min-width: 280px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.3);
        overflow: hidden;
        display: flex;
        flex-direction: column;
      }
      .imagen img {
        width: 100%;
        height: 180px;
        object-fit: cover;
      }
      .info {
        padding: 15px;
      }
      .info h3 {
        margin: 0 0 10px 0;
        font-size: 1.2rem;
      }
      .info p {
        margin: 0;
        color: #aaaaaa;
        font-size: 0.9rem;
      }
      #dias-totales{
        color:blue;
      }
    </style>
  </head>
  <body>
  <h1>CURSOS DE LA ACADEMIA</h1>
  <div class="cards">
    <?php 
      $xml = simplexml_load_file("academia.xml");
      $cursos = $xml->xpath("/cursos/curso");

      foreach($cursos as $curso) { 
        if($curso->tipo == "Presencial"){
    ?>
      <div class="tarjeta">
        <div class="imagen">
          <img src="<?= trim($curso->imagen, '"') ?>" alt="<?= $curso->nombre ?>">
        </div>
        <?php 
        // Calculo de dias entre fechas
        $fecha1 =  $curso->inicio;
        $fecha2 =  $curso->final;
        $fechaInicio = DateTime::createFromFormat('d/m/Y', $fecha1);
        $fechaFinal = DateTime::createFromFormat('d/m/Y',$fecha2);
        $diasTotalesCurso = $fechaInicio->diff($fechaFinal);
        ?>
        <div class="info">
          <h3><?= $curso->nombre ?></h3>
          <p><?= $curso->tipo ?></p>
          <p><?= $curso->subvencion ?></p>
          <p>INICIO:<?= $curso->inicio ?>/ FIN:<?= $curso->final ?></p>
          <p id="dias-totales">Dias Totales:<?= $diasTotalesCurso->days ?></p>
          <p>Duración:<?= $curso->duracion ?></p>
          <p>Días: <?= $curso->dias ?></p>
          <p>Horas: <?= $curso->horas ?></p>
        </div>
      </div>
    <?php 
       } } 
    ?>  
  </div>

  </body>
</html>
