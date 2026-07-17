<?php
// Configuración de la conexión a PostgreSQL
$dsn = "pgsql:host=localhost;port=5432;dbname=Neptuno";  
$user = "postgres";  
$password = "postgres";  

try {
    // Crear conexión PDO
    $pdo = new PDO($dsn, $user, $password);
    // Configurar PDO para que lance excepciones en caso de error
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    
    echo "Conexión exitosa a la base de datos.<br>";

} catch (PDOException $e) {
    // Manejo de errores
    echo "Error en la conexión: " . $e->getMessage();
}

  
?>