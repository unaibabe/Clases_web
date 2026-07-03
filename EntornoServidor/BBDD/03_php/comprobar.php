<?php

if ($_SERVER["REQUEST_METHOD"] == "GET") {
  
    echo "<details>";
    echo "<summary>datos por GET</summary>";
    
    echo "<h2>SOY GET</h2>";
    echo "<ul>";
    
    foreach ($_GET as $clave => $valor) {
        echo "<li>" . $clave . " = " . $valor . "</li>";
    }
    
    echo "</ul>";
    echo "</details>"; 
    
} else {
   
    echo "<details>";
    echo "<summary>Datos por POST</summary>";
    
    echo "<h2>SOY POST</h2>";
    echo "<ul>";
    
    foreach ($_POST as $clave => $valor) {
        echo "<li>" . $clave . " = " . $valor . "</li>";
    }
    
    echo "</ul>";
    echo "</details>";
}

?>
