package whatsapp;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Tempt {
    public static void main(String[] args) {

        Chat chat_1 = new Chat("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt");
        // System.out.println(chat_1.getParticipantes());
        // String[] participantes = chat_1.getParticipantes();
        // for (int i = 0; i <= participantes.length; i++) {
        // System.out.println(participantes[i]);
        // }
        System.out.println(chat_1.toString());
        // try {
        // File file = new File("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt");
        // FileReader fileReader = new FileReader(file);
        // BufferedReader buffer = new BufferedReader(fileReader);
        // String lineaW = buffer.readLine();
        // // System.out.println(buffer.readLine());

        // Linea linea = new Linea(lineaW);

        // } catch (IOException e) {
        // System.out.println(e);
        // }

    }

}