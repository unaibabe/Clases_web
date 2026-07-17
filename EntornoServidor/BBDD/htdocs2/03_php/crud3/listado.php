<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de contactos</title>
<script>
async function confirmar(nombre,apellidos) {
	if (confirm("¿Desea eliminar a "+nombre+" "+apellidos+"?")) {
		
    	const peticionAPI= {
    		"nombre":nombre,
    		"apellidos":apellidos
    	};
    	
    	try {
    		const respuesta=await fetch("borrar.php",
    			{ "method":"POST",
    				"headers": { "Content-Type":"application/json" } ,
    				"body":JSON.stringify(peticionAPI)
    			});
    			
    		if (!respuesta.ok) {
    			throw new Exception("No se pudo borrar el campo.");
    		} else {
    			window.location.reload();
    		}
    	
    	} catch (error) {
    		alert(error);
    	}



	}
}	

function confirmarTodo() {
	if (confirm("¿Desea eliminar TODOS los contactos?")) {
		window.location="borrarTodo.php";
	}
}

async function cambiarAlta(nombre,apellidos,alta) {
	const peticionAPI= {
		"nombre":nombre,
		"apellidos":apellidos,
		"alta":alta
	};
	
	try {
		const respuesta=await fetch("cambiarAlta.php",
			{ "method":"POST",
				"headers": { "Content-Type":"application/json" } ,
				"body":JSON.stringify(peticionAPI)
			});
			
		if (!respuesta.ok) {
			throw new Exception("No se pudo modificar el campo.");
		}
	
	} catch (error) {
		alert(error);
	}
}
</script>
</head>
<body>

<h1>Listado de contactos</h1>
<hr/>

<?php include("accesoBBDD.php"); ?>
<button onclick="confirmarTodo();">BORRAR TODO</button>
<table border="1">
	<thead>
		<tr>
        		<th>El.</th>
        		<th>Ac.</th>
        		<th>Código</th>
        		<th>Nombre</th>
        		<th>Apellidos</th>
        		<th>Fecha de nacimiento</th>
        		<th>Alta</th>
				<th>Centro de Trabajo</th>
    		</tr>
	</thead>
	<tbody>
<?php 

$sql="SELECT c.*, ct.nombre as nombrecentro FROM contactos as c LEFT JOIN centrotrabajo as ct ON c.centro = ct.codigo ORDER BY c.codigo;";
$consulta=$conexion->prepare($sql);
$consulta->execute();
$resultado=$consulta->get_result();

if ($resultado->num_rows==0) {
    echo "<tr><td colspan='8'>No existe ningún contacto</td></tr>";
} else {
    while ($contacto=$resultado->fetch_assoc()) { ?>
        <tr><td><img src="img/papelera.svg" style="cursor:pointer;"
        onclick="confirmar('<?=$contacto["nombre"]; ?>',
        '<?=$contacto["apellidos"]; ?>')"></td>

   		<td><img src='img/lapiz.svg' style='cursor:pointer;'
   		onclick="window.location='formulario_actualizar.php?nombre=<?=$contacto["nombre"]; ?>&apellidos=<?=$contacto["apellidos"]; ?>';"></td>
		<?php echo "<td>".$contacto["codigo"]."</td>";
        echo "<td>".$contacto["nombre"]."</td>";
        echo "<td>".$contacto["apellidos"]."</td>";
        echo "<td>";
        if ($contacto["fechaNacimiento"]==null) {
            echo "-";
        } else {
            echo date("d/m/Y",strtotime($contacto["fechaNacimiento"]));
        }
        echo "</td>";
        echo "<td>";
        echo "<input type='checkbox' ";
        if ($contacto["altas"]) {
            echo "checked";
        }
        echo " onclick=\"cambiarAlta('".$contacto["nombre"]."','".$contacto["apellidos"]."',";
        echo "this.checked);\">";
		echo "</td><td>";
		if($contacto["nombrecentro"] == null){
			echo "No tiene centro asociado";
		}else{
			echo $contacto["nombrecentro"];
		}
		echo "</td>";
        // echo "<input type='checkbox' ".($contacto["alta"]?"checked":"").">";
        
        echo "</td></tr>";
    }
}


$consulta->close();
$conexion->close();

?>
	
	
	
	
</tbody>

</table>




</body>
</html>