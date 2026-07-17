<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado Libros</title>
</head>
<style>
/* Configuración global para el fondo oscuro de la página */
body {
    background-color: #121212; /* Fondo negro carbón principal */
    color: #ffffff;
    margin: 0;
    font-family: Arial, sans-serif;
}

/* Título Principal de la Página */
h3 {
    font-family: 'Playfair Display', Georgia, serif;
    font-size: 28px;
    color: #ffffff;
    text-align: center;
    margin-top: 30px;
    margin-bottom: 10px;
}

/* Enlace / Botón Superior de Alta */
.boton-alta {
    display: block;
    width: fit-content;
    margin: 0 auto 30px auto;
    background-color: #00aa55; /* Verde un poco más brillante para que resalte en el fondo oscuro */
    color: #ffffff;
    text-decoration: none;
    font-weight: bold;
    padding: 12px 24px;
    border-radius: 4px;
    box-shadow: 0 4px 12px rgba(0, 170, 85, 0.2);
    transition: background-color 0.2s ease, transform 0.2s ease;
}

.boton-alta:hover {
    background-color: #00cd66;
    transform: translateY(-1px);
}

/* Grid de la Biblioteca */
.biblioteca {
    width: 95%;
    max-width: 1200px;
    margin: 0 auto;
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 30px;
    padding: 20px;
}

/* Tarjeta de Libro en Modo Oscuro */
.tarjeta-libro {
    display: flex;
    flex-direction: column;
    background-color: #1e1e1e; /* Fondo gris oscuro para las tarjetas */
    border-radius: 6px;
    padding: 14px;
    border: 1px solid #2d2d2d; /* Borde muy sutil para delimitar la tarjeta */
    transition: transform 0.2s ease, border-color 0.2s ease, box-shadow 0.2s ease;
    overflow-wrap: anywhere;
}

.tarjeta-libro:hover {
    transform: translateY(-4px);
    border-color: #00aa55; /* El borde se ilumina en verde al pasar el ratón */
    box-shadow: 0 8px 24px rgba(0, 0, 0, 0.4);
}

/* Contenedor de la Portada */
.imagen-container {
    width: 100%;
    height: 320px;
    background-color: #252525; /* Fondo ligeramente más claro que la tarjeta */
    display: flex;
    justify-content: center;
    align-items: center;
    margin-bottom: 16px;
    border-radius: 4px;
}

.imagen-container img {
    max-width: 85%;
    max-height: 85%;
    object-fit: contain;
    /* Sombra para dar volumen a la portada sobre el fondo oscuro */
    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.5);
}

/* Tipografía de los Datos en Modo Oscuro */
.tarjeta-libro .titulo-libro {
    font-size: 15px;
    font-weight: bold;
    color: #ffffff; /* Título en blanco puro */
    margin: 0 0 6px 0;
    line-height: 1.4;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    overflow: hidden;
}

.tarjeta-libro .autor-libro {
    font-size: 13px;
    color: #aaaaaa; /* Gris claro para el autor */
    text-transform: uppercase;
    letter-spacing: 0.5px;
    margin-bottom: 12px;
}

.tarjeta-libro .meta-info {
    font-size: 12px;
    color: #777777; /* Gris medio para el ISBN */
    margin: 2px 0;
}

.tarjeta-libro .badge-disponible {
    font-size: 12px;
    font-weight: bold;
    color: #00aa55; /* Texto verde brillante */
    margin-top: 8px;
}

/* Iconos de Control Adaptados al Modo Oscuro */
.iconos {
    display: flex;
    justify-content: flex-start;
    gap: 14px;
    margin-top: auto;
    padding-top: 16px;
    border-top: 1px solid #2d2d2d; /* Línea divisoria sutil */
}

.iconos img {
    width: 18px;
    height: 18px;
    cursor: pointer;
    /* Este filtro vuelve los iconos SVG oscuros a color blanco para que contrasten */
    filter: brightness(0) invert(1); 
    opacity: 0.6;
    transition: opacity 0.2s ease, transform 0.2s ease;
}

.iconos img:hover {
    opacity: 1;
    transform: scale(1.1);
}

/* Color específico al pasar el ratón sobre los iconos */
#lapiz:hover {
    filter: invert(53%) sepia(87%) saturate(452%) hue-rotate(182deg) brightness(97%) contrast(92%); /* Tinte azul al hover */
}

#papelera:hover {
    filter: invert(34%) sepia(74%) saturate(2326%) hue-rotate(339deg) brightness(89%) contrast(93%); /* Tinte rojo al hover */
}


</style>
<?php 
    include("accesoBBDD.php");
    $sql = "SELECT * FROM libros";
    $consulta = $conexion->prepare($sql);
    $consulta->execute();
    $resultado  = $consulta->get_result();

    ?>
<body>
    <script>
        async function eliminar(autor,isbn){
            if(confirm(`Vas a eliminar a ${autor} con isbn ${isbn}`))
            {
            
                const peticionApi = {
                    "autor":autor,
                    "isbn": isbn
                };

                try{
                    const respuesta = await fetch("borrarLibro.php",
                        {
                            "method":"POST",
                            "headers":{"Content-Type":"application/json"},
                            "body":JSON.stringify(peticionApi)
                        }
                    );
                    if(!respuesta.ok){
                        throw new Exception("No se ha podido borrar el libro");
                    }else{
                        window.location.reload();
                    }
                }
                catch(error){
                    alert(error);
                }
            }
        }
        
    </script>
    <h3>Todos Nuestros Libros</h3>
    <a class="boton-alta" href="formularioAltaLibros.html">＋ Dar de alta nuevo libro</a>

    <div class="biblioteca">
    <?php
    while($dato = $resultado->fetch_assoc()){
        echo "<div class='tarjeta-libro'>";
        echo "<div class='imagen-container'><img src='img/". $dato["imagen"]."'></div>";
        echo "<div class='titulo-libro'>". $dato["titulo"]."</div>";
        echo "<div class='autor-libro'>". $dato["autor"]."</div>";
        echo "<div class='meta-info'>ISBN: " .$dato["isbn"]."</div>";
        echo "<div class='badge-disponible'>● ". $dato["disponible"]."</div>";
        ?>
        <div class="iconos">
            <img id="lapiz" src="img/lapiz.svg" alt="Editar" >
            <img id="papelera" src="img/papelera.svg" alt="Borrar" onclick= "eliminar('<?= $dato['autor'] ?>','<?= $dato['isbn'] ?>')">
        </div>
        <?php
        echo "</div>";
    }
    ?>
    </div>
</body>


</body>
</html>