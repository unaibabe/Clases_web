<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libreria simplificadora</title>
</head>
<body>
	<?php 
		// 
		$conexion = new PDO("mysql:host=localhost;dbname=neptuno;charset=utf8","root","");
		$sql = "SELECT NombreCompañía FROM clientes WHERE NombreCompañía LIKE :nombre";
		$consulta = $conexion->prepare($sql);

		$consulta->execute(["nombre"=>"A%"]);

		while($cliente=$consulta->fetch(PDO::FETCH_ASSOC)){
			echo $cliente["NombreCompañía"] . "<br>";
		}
		echo "<hr>";
		// Version B
		$consulta->execute(["nombre"=>"A%"]);
		$clientes = $consulta->fetchAll(PDO::FETCH_ASSOC);

		

		foreach($clientes as $cliente){
			echo $cliente["NombreCompañía"] . "<br>";
		}
		echo "<hr>";
		echo $consulta->rowCount();
	
	
	?>
</body>
</html>