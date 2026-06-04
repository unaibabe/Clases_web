package id;


/**
 * Write a description of class Tarjeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarjeta
{
    private boolean activa;
    private int numeroTarjeta;
    
    public Tarjeta(int numeroTarjeta, boolean activo){
        this.numeroTarjeta = numeroTarjeta;
        this.activa = activo;
    }
    
    public String toString(){
        String mensaje;
        return "La tarjeta " + this.numeroTarjeta + (!this.activa?" NO":"") + " Esta activa";
        
    }
    
}