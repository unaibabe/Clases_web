
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.regex.*;
public class Prueba
{
    public static void main(String[] args){
        String cod = new String("7-2005/7A");
        Pattern patron = Pattern.compile("\\D{1,2}-\\d{4}\\/\\d\\D");//Doble barra para que no de error
        Matcher busqueda = patron.matcher(cod);
        
        System.out.println(busqueda.matches());
    }
}