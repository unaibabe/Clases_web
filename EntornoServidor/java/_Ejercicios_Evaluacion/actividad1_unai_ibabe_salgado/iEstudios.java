/**
 * Esta interfaz define los métodos de cualquier programa académico
 * 
 * @author Juan Pedro Cerro Martínez
 * @version 23/02/2022
 */

public interface iEstudios
{
    /**
     * Método accesor de la propiedad "titulacion"
     * 
     * @return Devuelve el String de la propiedad "titulacion" 
     */
    String getTitulacion();
    
    /**
     * Método accesor de la propiedad "direccion"
     * 
     * @return Devuelve el String de la propiedad "titulacion" 
     */
    String getDireccion();   
    
    /**
     * Método accesor de la propiedad "creditos"
     * 
     * @return Devuelve el byte de la propiedad "creditos" 
     */
    short getCreditos();
    
    /**
     * Método instanciador de la propiedad "titulacion"
     * 
     * @param pTitulacion Nombre de la titulación 
     */
    void setTitulacion(String pTitulacion);
    
    /**
     * Método instanciador de la propiedad "direccion"
     * 
     * @param pDireccion Nombre de la persona que dirige el programa académico
     */
    void setDireccion(String pDireccion);   
    
    /**
     * Método instanciador de la propiedad "creditos"
     * 
     * @param pCreditos Número de créditos de la titulación
     */
    void setCreditos(short pCreditos);   

    /**
     * Método que devuelve un String con el tipo de programa
     * {"Grado" | "Máster"}
     * 
     * @return Devuelve el String con el tipo de programa 
     */
    String getTipoPrograma();   
}
