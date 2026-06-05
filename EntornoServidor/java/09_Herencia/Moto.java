
public class Moto extends Vehiculo
{
    private int potencia;
    
    public Moto(int ruedas, int p){
    super(ruedas);
    potencia = p;
    }
    public Moto(){
        super(2);
    
    }
    
    public int getPotencia(){
        System.out.println(this.getClass()+" tiene " + this.potencia+ "cc");
        return this.potencia;
    }
    public void setPotencia(int potencia){
        System.out.println("la potencia de "+this.getClass()+ " es de "+potencia +"cc");
    }
}
