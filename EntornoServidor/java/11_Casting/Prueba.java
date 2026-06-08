
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    public static void main(String[] args){
        byte b= 125;
        short s= 210;
        s=b;//conversion implicita
        System.out.println(b=(byte)s);//conversion explicita
        
        //s= 3.2; no se puede porque es doble
        s= (short) 3.2;
        System.out.println(s);
        // Dos maneras de hacer el float
        float  f = (float) 4.5;
        f = 45.45f;
        
        // Promocion de datos
        b=10;
        s=(short)(b*b);
        
        s=(short)32768;
        s=(short)(s*s);
        System.out.println(s);
        
        System.out.println("=================================");
        
        String n = new String("24.5");
        
        System.out.println(Double.parseDouble(n)+2);
    }
}