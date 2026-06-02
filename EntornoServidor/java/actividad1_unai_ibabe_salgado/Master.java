/**
 * Contiene la especialización de un programa académico de la universidad
 * 
 * @author Juan Pedro Cerro Martínez
 * @version 23/02/2022
 */
public class Master extends Programa
{

    private String especialidad;
    private char tipo;
    
    /**
     * Constructor de la clase Master
     * 
     * @param pTitulacion Nombre de la titulación
     * @param pDireccion Nombre de la persona que dirige el programa académico
     * @param pCreditos Número de créditos de la titulación
     * @param pEspecialidad Descripción de la especialidad del Máster
     * @param pTipo Tipo de Máster (I=investigador | P=Profesionalizador)
     */
    public Master(String pTitulacion, String pDireccion, short pCreditos, String pEspecialidad, char pTipo)
    {
        super(pTitulacion,pDireccion,pCreditos);
        setTipo(pTipo);
        this.numMasters++;
        this.especialidad = pEspecialidad;
        
    }

    /**
     * Método accesor de la propiedad "especialidad"
     * 
     * @return Devuelve el String de la propiedad "especialidad"
     */
    public String getEspecialidad(){
        return this.especialidad;
    }
    
    /**
     * Método instanciador de la propiedad "especialidad"
     * 
     * @param pEspecialidad Descripción de la especialidad del Máster 
     */
    public void setEspecialidad(String pEspecialidad){
        this.especialidad=pEspecialidad;
    }
    
    /**
     * Método accesor de la propiedad "tipo"
     * 
     * @return Devuelve el String de la propiedad "tipo"
     */
    public char getTipo(){
        return this.tipo;
    }
    
    /**
     * Método instanciador de la propiedad "tipo"
     * 
     * @param pTipo Tipo de Máster (I=investigador | P=Profesionalizador)
     */
    public void setTipo(char pTipo){
        this.tipo=pTipo;
    }
    
    public String getTipoPrograma(){
        return "Master";
    }

}
