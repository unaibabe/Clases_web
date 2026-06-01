public class Edificio {
    private int altura;
    
    public Edificio (){
        //this.altura = 0;
        this.setAltura(0);
    }
    
    public Edificio(int pAltura){
        //this.altura = altura manera clasica
        this.setAltura(pAltura); // Metodo pro
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public void setAltura(int pAltura){
        this.altura = pAltura;
    }
    
}