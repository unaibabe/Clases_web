<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de CD's</title>
</head>
<style>
    details{
        width: 90%;
        height: 80px;
        border:solid 1px black;
        border-radius: 8px;
        margin-bottom:5px;
        padding-left: 10px;
        overflow:hidden;
        backGround-color:rgba(152, 144, 144, 0.4);
        display:flex;
        align-items:center;
    }
</style>
<body>
    <?php
        $xml=simplexml_load_file("catalogo.xml");

        $cds = $xml->xpath("/catalog/cd");
        foreach ($cds as $cd){
            echo $cd->title. "<br>";
        }

        echo "<hr>";

        $artistas = $xml->xpath("//artist");
        foreach ($artistas as $artista){
            echo $artista["año"]."-".$artista. "<br>";
        }
        echo "<hr>";
        echo "LISTA ORDENADO POR FECHAS<br>";
        $artistas = $xml->xpath("//artist");
        $listadoOrdenado = [];
        foreach($artistas as $artista){
            $año = (string)$artista["año"];
            $listadoOrdenado[$año]=$artista;
        }
        ksort($listadoOrdenado);
        foreach($listadoOrdenado as $año=>$nombre){
            echo "Año: ". $año , "-". " Artista: ". $nombre. "<br>";
        }
        


        echo "<hr>";
        $artistas = $xml->xpath("//artist");
        $listadoOrdenado2 = [];
        foreach($artistas as $artista){
            $año = (string)$artista["año"];
            if(!array_key_exists($año,$listadoOrdenado2)){
                $listadoOrdenado2[$año]=[];

            }
            $listadoOrdenado2[$año][]=$artista;
        }
        ksort($listadoOrdenado2);
        foreach($listadoOrdenado2 as $año=>$nombres){
            echo "<details><summary>".$año."</summary>";
            foreach($nombres as $nombre){
                echo "<p>".$nombre."</p>";
            }
            echo "</details>";
        }
    ?>

</body>
</html>
