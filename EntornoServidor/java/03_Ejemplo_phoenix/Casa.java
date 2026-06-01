public class Casa extends Edificio {
    private double precio;
    
    public Casa (){
        this.setPrecio(0);
        this.setAltura(0);
        System.out.println("Casa creada con 0 metros de altura y 0€.");
    }
    
    public Casa(double pPrecio){
        this.setPrecio(pPrecio); 
        System.out.println("Casa creada con 0 metros de altura y " + pPrecio + "€");

    }
    
    public Casa(double pPrecio, int pAltura){
        this.setPrecio(pPrecio); 
        this.setAltura(pAltura);
        System.out.println("Casa creada con " + pAltura + " metros de altura y " + pPrecio + "€");

    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double pPrecio){
        this.precio = pPrecio;
    }
    
}