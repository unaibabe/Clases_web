
/**
 * Write a description of class Nif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nif
{
    private String nif;
    private static final String LETRAS="TRWAGMYFPDXBNJZSQVHLCKE";
    
    public Nif(){}
    
    public Nif(String pNif){
        this.nif = pNif;
    }
    
    public void  setNif(String pNif){
        this.nif = pNif;
    }
    public String getNif(){
    return this.nif;
    }
    
    public char getLetra(){
        char letra = this.nif.charAt(this.nif.length()-1);
        return letra;
    }
    
    
    
}