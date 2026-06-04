
/**
 * Write a description of class Tempt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tempt
{
    public static void main(String[] args){
        String text = "   Esto es una prueba   ";
        System.out.println(text.length());
        text = text.trim();
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.substring(8,11));
        System.out.println(6%8);
    }
}