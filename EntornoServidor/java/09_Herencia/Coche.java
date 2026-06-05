
public class Coche extends Vehiculo
{
    private int puertas;
    
    public Coche(int p){
        super(0);
        puertas = p;
    }
    public Coche(int r,int p){
        super(r);
        puertas = p;
    }
    
}