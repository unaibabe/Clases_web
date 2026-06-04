
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import id.Tarjeta;

public class Cliente
{
    private String nombre;
    private int edad;
    private Tarjeta tarjeta;
    private Cliente repre;
    
    public Cliente(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setTarjeta(Tarjeta pTarjeta)
    {
        this.tarjeta=pTarjeta;
    }
    
    public void setRepresentante(Cliente r){
            this.repre = r;
    }
    public Tarjeta getTarjeta(){
        return this.tarjeta;
    }
    public Cliente getRepre(){
        return this.repre;
    }
    public String toString(){
        String mensaje = "";
        mensaje =  "El nombre del cliente:" + this.nombre+"\n"+"--------------------\n";
        mensaje+= "su edad es "+ this.edad+ "\n"+"--------------------\n"; 
        mensaje+= " Su tarjeta es: " + getTarjeta()+"\n"+"--------------------\n"; 
        return mensaje;
    }
    
}