public class Pruebas 
{
    public static void comprar(Vehiculo v){
        if(v instanceof Coche){
        System.out.println("Te has comprado un coche ->" + v.getClass());
        }
        else if(v instanceof Moto){
            System.out.println("Te has comprado una moto" );
        }
    }
    
    public static void main(String[] args){
        Vehiculo v = new Vehiculo(0);
        //v.setRuedas(2); 
        Coche c = new Coche(4);
        //c.setRuedas(4);
        Moto m = new Moto();
        //m.setPotencia(125);
        
        
        comprar(m);
        comprar(c);
        
        
    }
}