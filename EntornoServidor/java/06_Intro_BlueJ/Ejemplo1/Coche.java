
/**
 * Write a description of class Coche here.
 * 
 * @author unai 
 * @version 02-06-2026
 */
public class Coche
{
    /** Numero de puertas del coche */
    private int puertas;
    
    public Coche(int pPuertas)
    {
        this.puertas = pPuertas;
    }
    /** Metodo para obtener el numero de puertas del coche
     * @return retorna el numero de puertas
     */
    public int getPuertas(){
        return this.puertas;
    }
    /** Metodo para instanciar el numero de puertas
     * @param pPuertas numero de puertas a instanciar
     */
    public void setPuertas(int pPuertas){
        this.puertas = pPuertas;
    }
    public boolean equals(Coche coche){
        return (this.puertas==coche.getPuertas());
        //paradigma declarativo -> logico (tambien esta el funcional pero este es logico)
    }
    public String toString(){
        return super.toString() + "\n Coche con " + this.getPuertas() + " puertas";
    }
}