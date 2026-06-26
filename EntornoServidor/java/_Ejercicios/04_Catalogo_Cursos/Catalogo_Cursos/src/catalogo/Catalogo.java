package catalogo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Curso> cursos;
	
	public Catalogo(String url) {	
		this.cursos = new ArrayList<Curso>(); 
		File file = new File(url);
		try 
		{
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			String linea;
			
			while((linea = br.readLine()) != null){
				this.cursos.add(new Curso(linea));	
			}
		}
		catch(IOException e) 
		{
			System.out.println("Error al leer archivo");
		}
	}
	
	public void getCurso(int numero) {
		System.out.println(this.cursos.get(numero));
	}
	
	public ArrayList<Curso> getCursos(){
		return this.cursos;
	}
	
	@Override
	public String toString() {
	    String html = new String();
	    
	    html =
	            """
	            <!DOCTYPE html>
	<html lang="es">
	<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Catálogo de Cursos</title>
	<style>
	    body {
	        background-color: #121212;
	        color: white;
	        font-family: sans-serif;
	        margin: 0;
	        padding: 40px;
	        
	        /* Configuración del Grid de 4 columnas */
	        display: grid;
	        grid-template-columns: repeat(4, 1fr); /* Crea 4 columnas del mismo tamaño */
	        gap: 20px;                             /* Espacio entre las tarjetas */
	        justify-items: center;                 /* Centra las tarjetas en su celda */
	    }
	    
	    /* Responsive: Si la pantalla es pequeña (tablets), baja a 2 columnas */
	    @media (max-width: 1200px) {
	        body {
	            grid-template-columns: repeat(2, 1fr);
	        }
	    }
	    
	    /* Responsive: Si es un celular, se muestra 1 sola columna */
	    @media (max-width: 600px) {
	        body {
	            grid-template-columns: 1fr;
	        }
	    }

	    .tarjeta {
	        width: 100%;
	        max-width: 300px; /* Evita que se estiren demasiado en pantallas gigantes */
	        height: 500px;
	        background-color: #1e1e1e;
	        border-radius: 12px;
	        box-shadow: 0 4px 15px rgba(34, 34, 34, 0.5);
	        padding: 15px;
	        display: flex;
	        flex-direction: column;
	        gap: 12px;
	        box-sizing: border-box;
	    }
	    .imagen {
	        width: 100%;
	        height: 160px;
	        border-radius: 8px;
	        overflow: hidden;
	    }
	    img {
	        width: 100%;
	        height: 100%;
	        object-fit: cover;
	    }
	    .texto {
	        display: flex;
	        flex-direction: column;
	        gap: 8px;
	        height: 100%;
	    }
	    h3 {
	        margin: 0;
	        font-size: 1.2rem;
	        letter-spacing: 0.5px;
	    }
	    hr {
	        width: 100%;
	        border: 0;
	        border-top: 1px solid #444;
	        margin: 0;
	    }
	    .contenedor-etiquetas {
	        display: flex;
	        gap: 6px;
	        justify-content: flex-start;
	        flex-wrap: wrap;
	        margin-top: 4px;
	    }
	    .etiqueta {
	        background-color: #2b5b84;
	        color: #ffde57;
	        font-weight: bold;
	        font-size: 0.75rem;
	        padding: 4px 8px;
	        border-radius: 4px;
	        margin: 0;
	    }
	    .boton {
	        background-color: #2b8432;
	        color: #ffffff;
	        font-weight: bold;
	        font-size: 1.25rem;
	        padding: 4px 8px;
	        border-radius: 4px;
	        margin: auto auto 0 auto; /* Empuja el botón siempre al fondo de la tarjeta */
	        width: 70%;
	        text-align: center;
	        cursor: pointer;
	    }
	    p {
	        margin: 4px 0 0 0;
	        font-size: 0.9rem;
	        color: #ccc;
	        line-height: 1.4;
	    }
	</style>
	</head>
	<body>
	            """;
	    for(Curso curso: cursos) {
	        html+=curso;
	    }
	    
	    html+=
	            """
	            </body>
	            </html>
	            """;
	    
	    return html;
	}
}
	



