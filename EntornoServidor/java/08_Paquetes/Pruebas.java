
/**
 * Write a description of class Pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import id.Tarjeta;

public class Pruebas
{
    public static void main(String[] args){
        Tarjeta tajeta_1 = new Tarjeta(11111, true);
        Cliente cliente_1 = new Cliente("Juan", 28);
        Cliente cliente_2 = new Cliente("Maria", 51);
        
        cliente_1.setTarjeta(tajeta_1);
        cliente_1.setRepresentante(cliente_1);
        cliente_2.setTarjeta(new Tarjeta(222,false));
        
        
        System.out.println(tajeta_1.toString());
        System.out.println("\n-----------------");
        System.out.println(cliente_1.toString());
        System.out.println("\n-----------------");
        System.out.println(cliente_2.toString());
        System.out.println("\n-----------------");
        System.out.println(cliente_1.getRepre().getTarjeta());

        
        
        
    }
}