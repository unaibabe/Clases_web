<?php

if ($_SERVER["REQUEST_METHOD"] == "GET") {
    $campos = $_GET;
    
} elseif ($_SERVER["REQUEST_METHOD"] == "POST") {
    $campos = $_POST;
    
}
echo "<details>";
echo "<summary>datos por ". $_SERVER['REQUEST_METHOD']."</summary>";

echo "<h2>SOY " . $_SERVER['REQUEST_METHOD']."</h2>";
echo "<ul>";

foreach ($campos as $clave => $valor) {
    echo "<li>" . $clave . " = " . $valor . "</li>";
}

echo "</ul>";
echo "</details>";
?>
