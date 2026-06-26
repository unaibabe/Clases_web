package catalogo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {		
		String texto = "https://example.com/images/python.jpg;Curso Completo de Python;programacion;python;desarrollo;https://example.com/cursos/python\r\n";
		
//		Curso curso= new Curso(texto);
//		System.out.println(curso);
		Catalogo catalogo = new Catalogo("C:\\\\Users\\\\IPC\\\\Downloads\\\\Clases_web-main\\\\Clases_web-main\\\\EntornoServidor\\\\java\\\\_Ejercicios\\\\04_Catalogo_Cursos\\\\catalogoCursos.csv");
//		catalogo.getCurso(2);
		System.out.println(catalogo.toString());
		

	}

}
