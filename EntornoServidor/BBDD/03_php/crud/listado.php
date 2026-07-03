<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de contactos</title>
</head>
<body>
<h1>Listado de contactos</h1>
<hr>

<img style='cursor:pointer;' src='img/deleteIcon.svg' onclick='borrarTodo()'>Borrar Todos
<table border=1>
	<thead>
		<tr>
			<th>Delete</th>
			<th>Edit</th>
    		<th>Codigo</th>
    		<th>Nombre</th>
    		<th>Apellido</th>
    		<th>Fecha nacimiento</th>
    		<th>Alta</th>
    	</tr>
	</thead>
	<tbody>
 <?php  
 include("accesoBBDD.php");
 $sql = "SELECT * FROM `contactos`  ORDER BY codigo";
 $consulta = $conexion->prepare($sql);
 $consulta->execute();
 $resultado = $consulta->get_result();
 
 if($resultado->num_rows==0){
     echo "<tr><td colspan='7'>No existe ningun contacto</td></tr>";
 } else{
     while($contacto = $resultado->fetch_assoc()){
         echo "<tr><td><img id='eliminar' onclick='confirmar(\"" . $contacto["nombre"] . "\", \"" . $contacto["apellidos"] . "\");' src='img/deleteIcon.svg' style='cursor:pointer'></td>";
//          echo "<td><img onclick='editar(\"".$contacto["codigo"]."\", \"".$contacto["nombre"]."\", \"".$contacto["apellidos"]."\", \"".$contacto["altas"]."\", \"".$contacto["fechaNacimiento"]."\")' src='img/editIcon.svg' style='cursor:pointer;'></td>";
         echo "<td><img onclick='editar2(\"" . $contacto["nombre"] . "\", \"" . $contacto["apellidos"] . "\");' src='img/editIcon.svg' style='cursor:pointer;'></td>";
         
         echo "<td>".$contacto['codigo']."</td>";
         echo "<td>".$contacto['nombre']."</td>";
         echo "<td>".$contacto['apellidos']."</td>";
         
         $date = new DateTime($contacto['fechaNacimiento']);
         
         if($contacto['fechaNacimiento']== null){
             echo "<td> - </td>";
         }else{
         $dateFormat = $date->format('d/m/Y');
         
         echo "<td>".$dateFormat."</td>";}
         // FORMA CLASSIC
//          if($contacto['altas']==1){
//              echo "<td><input type='checkbox' disabled checked></td></tr>";
//          }else{
//              echo "<td><input type='checkbox' disabled </td></tr> ";
//          }
//          echo "<td>".$contacto['altas']."</td></tr>";

        // FORMA PRO
        echo "<td><input type='checkbox' disabled ". ($contacto["altas"] ? "checked" : '') . "></td></tr>";
         
     }
 }
 ?>
	</tbody>
</table>

<script>
	
	function confirmar(nombre,apellidos){
		if (confirm("Desea elimninar a " + nombre+ " " + apellidos +"?")){
			window.location="borrar.php?nombre="+nombre+"&apellidos="+apellidos;
		}
	}
	
	function borrarTodo(){
		if (confirm("Desea elimninar todo?")){
			window.location="borrarTodo.php";
		}
	}
	
	function editar(codigo,nombre,apellidos,altas,fechaNacimiento){
		window.location = "formulario_actualizar_2.php?codigo=" + codigo + "&nombre=" + nombre + "&apellidos=" + apellidos + "&altas=" + altas + "&fechaNacimiento=" + fechaNacimiento;

	}
	
	function editar2(nombre,apellidos){
		window.location="formulario_actualizar_2.php?nombre="+nombre+"&apellidos="+apellidos;
	}
	

</script>
</body>
</html>