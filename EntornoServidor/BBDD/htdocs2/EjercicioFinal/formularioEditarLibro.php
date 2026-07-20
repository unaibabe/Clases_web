<!doctype html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Editar Libro</title>
    <style>
      /* Configuración global en Modo Oscuro */
      body {
        background-color: #121212; /* Fondo negro carbón del catálogo */
        font-family: "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
        color: #ffffff;
        margin: 0;
      }

      /* Contenedor superior para el botón de navegación */
      .navegacion-superior {
        width: 50%;
        max-width: 600px;
        margin: 40px auto 0 auto;
        display: flex;
        justify-content: flex-start;
      }

      /* Botón volver al listado estilizado */
      .boton-volver {
        display: inline-flex;
        align-items: center;
        background-color: transparent;
        color: #00aa55; /* Texto verde */
        text-decoration: none;
        font-size: 14px;
        font-weight: bold;
        padding: 10px 18px;
        border: 1px solid #00aa55; /* Borde verde fino */
        border-radius: 4px;
        transition: all 0.2s ease;
      }

      .boton-volver:hover {
        background-color: #00aa55;
        color: #ffffff; /* Se invierte el color al pasar el ratón */
        box-shadow: 0 4px 12px rgba(0, 170, 85, 0.15);
      }

      h1 {
        text-align: center;
        font-family: "Playfair Display", Georgia, serif;
        font-size: 28px;
        color: #ffffff;
        margin-top: 20px;
        margin-bottom: 10px;
        font-weight: bold;
      }

      /* Tarjeta de Formulario adaptada al estilo Dark */
      form {
        display: flex;
        flex-direction: column;
        width: 50%;
        max-width: 600px;
        margin: 20px auto 100px auto;
        background-color: #1e1e1e; /* Mismo color de las tarjetas de libros */
        border-radius: 6px; /* Acabado minimalista */
        border: 1px solid #2d2d2d; /* Borde sutil delimitador */
        box-shadow: 0 8px 24px rgba(0, 0, 0, 0.4);
        padding: 30px 40px;
      }
      legend {
        text-align: center;
        font-size: 20px;
        font-weight: bold;
        color: #ffffff;
        margin-bottom: 15px;
      }
      label {
        margin: 12px 5px 4px 5px;
        font-size: 14px;
        color: #aaaaaa; /* Gris claro para los textos de ayuda */
        font-weight: 500;
      }
      /* Inputs de texto adaptados a la interfaz oscura */
      input[type="text"] {
        border-radius: 4px;
        border: 1px solid #3d3d3d; /* Reemplazado el borde negro grueso por uno fino oscuro */
        font-size: 15px;
        background-color: #252525; /* Fondo integrado con el modo oscuro */
        color: #ffffff; /* Texto visible en blanco */
        padding: 8px 12px;
        height: 24px;
        font-family: inherit;
        transition: border-color 0.2s ease;
      }
      input[type="text"]:focus {
        border-color: #00aa55; /* Enfoque con el verde brillante al escribir */
        outline: none;
      }
      /* Selector de archivos (portada) en modo oscuro */
      input[type="file"] {
        margin: 5px;
        padding: 12px;
        border: 2px dashed #00aa55; /* Borde discontinuo verde */
        border-radius: 4px;
        background-color: #252525;
        color: #aaaaaa;
        cursor: pointer;
        font-family: inherit;
      }
      /* Botón de registrar con el verde corporativo del e-commerce */
      input[type="submit"] {
        height: 44px;
        background-color: #00aa55;
        border-radius: 4px;
        color: white;
        border: none;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
        margin-top: 25px;
        box-shadow: 0 4px 12px rgba(0, 170, 85, 0.15);
        transition:
          background-color 0.2s ease,
          transform 0.2s ease;
      }
      input[type="submit"]:hover {
        background-color: #00cd66;
        transform: translateY(-1px);
      }

      /* Contenedor del checkbox */
      .checkbox-grup {
        display: flex;
        align-items: center;
        margin: 15px 5px 5px 5px;
      }
      input[type="checkbox"] {
        height: 18px;
        width: 18px;
        margin-right: 10px;
        accent-color: #00aa55; /* Fuerza al navegador a pintar el checkbox en verde */
        cursor: pointer;
      }
      .checkbox-grup label {
        margin: 0;
        color: #ffffff;
        cursor: pointer;
      }
    </style>
  </head>
  <body>
    <?php 
      if(!isset($_GET["id"])){
        echo "<h3>No hay datos para actualizar </h3>";
      }
      else{
        echo $_GET["titulo"];
        $id = $_GET["id"];
        $titulo = $_GET["titulo"];
        $autor = $_GET["autor"];
        $isbn = $_GET["isbn"];
        $disponible = $_GET["disponible"];
        $imagen = $_GET["imagen"];
        echo $_GET["imagen"];

      }
    
    
    ?>
    <!-- Contenedor superior para el botón de navegación -->
    <div class="navegacion-superior">
      <a class="boton-volver" href="listadoLibros.php">← Volver al Listado</a>
    </div>

    <h1>Formulario para editar Libros</h1>

    <form action="editarLibro.php" method="POST" enctype="multipart/form-data">
      <legend>Edita tu libro</legend>

      <input
        type="hidden"
        name="id"
        id="id"
        value = "<?= $id ?>"
        required
      />

      <label for="titulo">Titulo:</label>
      <input
        type="text"
        name="titulo"
        id="titulo"
        placeholder="Ej. El camino de los reyes"
        value = "<?= $titulo ?>"
        required
      />

      <label for="autor">Autor:</label>
      <input
        type="text"
        name="autor"
        id="autor"
        value = "<?= $autor ?>"
        placeholder="Brandom Sanderson"
        required
      />

      <label for="isbn">ISBN:</label>
      <input
        type="text"
        name="isbn"
        id="isbn"
        value = "<?= $isbn ?>"
        placeholder="Ej. 987654321"
        required
      />

      <label for="imagen">Portada del libro ACTUAL:</label>
      <input type="text" 
        name="imagen_actual" 
        id="imagen"  
        value = "<?=$imagen ?>"
        />

      <label for="imagen">Portada del libro a editar:</label>
      <input type="file" 
        name="imagen" 
        id="imagen" 
        accept="image/*"  
        />

      <div class="checkbox-grup">
        <input type="checkbox"
         name="disponible" 
         id="disponible" 
         <?php 
          if($disponible){
            echo "checked";
          }else{
            echo "";
          }
         ?>
         
         />
        <label for="disponible">Disponible</label>
      </div>

      <input type="submit" value="Registrar" />
    </form>
  </body>
</html>
