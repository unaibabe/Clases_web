/**
 * Abstract class Programa - Contiene la lista de propiedades y métodos
 * de un programa académico de la universidad
 * 
 * @author Juan Pedro Cerro Martínez
 * @version 23/02/2022
 */
public abstract class Programa implements iEstudios
{
    // Propiedades de la clase abstracta
    protected String titulacion;
    protected String direccion;
    protected short creditos;
    protected static int numGrados;
    protected static int numMasters;
    
    /**
     * Construcctor de la clase Programa
     * 
     * @param pTitulacion Nombre de la titulación
     * @param pDireccion Nombre de la persona que dirige el programa académico
     * @param pCreditos Número de créditos de la titulación
     */
    public Programa(String pTitulacion, String pDireccion, short pCreditos)
    {
        this.titulacion=pTitulacion;
        this.direccion=pDireccion;
        this.creditos=pCreditos;
    }
    
    /**
     * Método accesor de la propiedad "titulacion"
     * 
     * @return Devuelve el String de la propiedad "titulacion"
     */
    public String getTitulacion() {
        return this.titulacion;
    }
    
    /**
     * Método accesor de la propiedad "direccion"
     * 
     * @return Devuelve el String de la propiedad "direccion" 
     */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
     * Método accesor de la propiedad "créditos"
     * 
     * @return Devuelve el String de la propiedad "creditos" 
     */
    public short getCreditos() {
        return this.creditos;
    }

    /**
     * Método instanciador de la propiedad "creditos"
     * 
     * @param pCreditos Número de créditos 
     */
    public void setCreditos(short pCreditos) {
        this.creditos=pCreditos;
    }
    
    /**
     * Método instanciador de la propiedad "titulacion"
     * 
     * @param pTitulacion Nombre de la titulación 
     */
    public void setTitulacion(String pTitulacion) {
        this.titulacion=pTitulacion;
    }
 
    /**
     * Método instanciador de la propiedad "direccion"
     * 
     * @param pDireccion Nombre de la persona que dirige el programa académico 
     */
    public void setDireccion(String pDireccion) {
        this.direccion=pDireccion;
    }
    /*public abstract String getTipoPrograma(){
        return this.tipoPrograma; Deberia ser algo asi para segui la indicacion de uml pero no me sale
        porque no tenemos tipoPrograma.
    }*/
}
