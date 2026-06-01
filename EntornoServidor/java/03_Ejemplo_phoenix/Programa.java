public class Programa{
    public static void main(String[] args){
        Casa miCasa = new Casa(100000);
        Casa tuCasa = new Casa();
        Casa suCasa = new Casa(200000,20);
        
        tuCasa.setPrecio(50000);
        tuCasa.setAltura(10);
        
        
        // Imprimir
        System.out.println(suCasa.getAltura());
    }
}