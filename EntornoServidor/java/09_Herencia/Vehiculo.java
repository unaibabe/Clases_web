public class Vehiculo
{
    protected int ruedas;
    
    public Vehiculo(int r){
        ruedas = r;
    }
    
    public int getRuedas(){
        return ruedas;
    }
    
    public void setRuedas(int r){
        ruedas=r;
        System.out.println(r+" Ruedas asignadas a un objeto tipo:"+ this.getClass());
    }
}