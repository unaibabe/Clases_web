<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>WebScrapping de ADAMS</title>
  </head>
  <body>
<?php 
  $url = "https://www.adams.es/cursos/cursos-gratuitos/servicios-de-empleo/servei-d-ocupacio-de-catalunya-soc/";
  $html= file_get_contents($url);

  libxml_use_internal_errors(true);
  $domHtml = new DOMDocument();
  $domHtml->loadHTML($html);

  $consulta = new DOMXPath($domHtml);

  $nombre_curso = $consulta->query("//h3[@class='mb-2 font-outfit font-semibold text-base text-secondary-600 leading-[120%] underline lg:my-2']/a");
  foreach($nombre_curso as $curso){
    echo "<p><strong>". $curso->nodeValue ."</strong><br><a href = 'https://www.adams.es".$curso->getAttribute("href") ."'><button>Detalles</button></p>";
  }


?>


  </body>
</html>
