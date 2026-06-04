
/**
 * Write a description of class PruebaCoche here.
 * 
 * @author unai
 * @version 03/06/2026
 */
public class PruebaCoche
{
    public static void main (String[] args){
        System.out.println("Instanciando coches");
        Coche fiat500 = new Coche(3);
        Coche porche = new Coche(5);
        
        System.out.println("Asignar propiedades:");
        porche.setPuertas(4);
        fiat500.setPuertas(porche.getPuertas());
        
        System.out.println("Mostrar Resultados:");
        System.out.println("El fiat500 tiene " + fiat500.getPuertas() + " puertas");
        System.out.println("El porche tiene " + porche.getPuertas() + " puertas");
        
        System.out.println("Salida por defecto:");
        System.out.println(fiat500);
        System.out.println(porche);
        
}
}