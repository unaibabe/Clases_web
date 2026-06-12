
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class Tempt {
    public Tempt() {
    }

    public static void main(String[] args) {
        // String hora = "07:21";
        // DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:m");
        // LocalTime parsedDate = LocalTime.parse(hora, formato);
        // String date = parsedDate.format(formato);
        // String[] palabras = hora.split(":");
        // System.out.println(palabras.length);
        try{
        File file = new File("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);
        System.out.println(buffer.readLine());}
        catch(IOException e){
            System.out.println(e);
        }
    }
}
