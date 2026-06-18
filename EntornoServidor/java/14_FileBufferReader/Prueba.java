import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public static void main(String[] args) {
    String[] nombres = {"Ana", "Carlos", "María", "Juan", "Sofía"};

    File file = new File("TipoDeDatosParaChatWhatsapp.txt");
    try{
        FileReader fileReader = new FileReader(file);
        BufferedReader lector = new BufferedReader(fileReader);

        String linea;

        // while ((linea =lector.readLine())!= null ) {
        //     System.out.println(linea);        
        // }

        lector.close();
    } catch(IOException error){
        System.out.println("Error al leer archivo");

    }
    try{
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        // for(String nombre: nombres){
        //     writer.write(nombre);
        //     writer.newLine();
        // }
        // writer.append("unai");
        // writer.newLine();
        writer.write("UNAI");
        writer.close();
    }catch(IOException errorException){
        System.out.println("Error al escribir");

    }

}