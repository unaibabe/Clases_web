<h1>Te has conecetado usando el metodo <?php echo $_SERVER['REQUEST_METHOD']?></h1>

<?php 
if(!empty($_GET)){
    ?>
    <h2> Bienvenido <?php echo $_GET["nombre"] ?> </h2>
	<p> Y tu contraseña es <?php echo $_GET["clave"]?></p>
	
<?php 
} else{
    echo "<p> No me has enviado nada </p>";
}
?>

