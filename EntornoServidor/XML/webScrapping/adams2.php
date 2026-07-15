
<?php 
  $url = "https://www.adams.es/cursos/cursos-gratuitos/servicios-de-empleo/servei-d-ocupacio-de-catalunya-soc/";
  $html= file_get_contents($url);

  libxml_use_internal_errors(true);
  $domHtml = new DOMDocument('1.0', 'utf-8');
  $domHtml->loadHTML($html);
  
  $consulta = new DOMXPath($domHtml);
  
  $nombre_curso = $consulta->query("//h3[@class='mb-2 font-outfit font-semibold text-base text-secondary-600 leading-[120%] underline lg:my-2']/a");
  
  $dom = new DOMDocument('1.0', 'utf-8');
  $dom->formatOutput = true;

  $cursosElement = $dom->createElement("cursos");
  $dom->appendChild($cursosElement);

  foreach($nombre_curso as $curso){
    $cursoElement = $dom->createElement("curso");
    $nombreCurso = $dom->createElement("nombre", $curso->nodeValue);
    $urlCurso = $dom->createElement("url","https://www.adams.es". $curso->getAttribute("href"));

    $cursoElement->appendChild($nombreCurso);
    $cursoElement->appendChild($urlCurso);
    $cursosElement->appendChild($cursoElement);
   
  }

// echo "<pre>" . htmlspecialchars($dom->saveXML()) . "</pre>";
?>
header("Content-Type: application/xml; charset=utf-8");

