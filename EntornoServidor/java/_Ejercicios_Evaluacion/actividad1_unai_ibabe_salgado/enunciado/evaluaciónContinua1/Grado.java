/**
 * Contiene la especialización de un programa académico de la universidad
 * 
 * @author Juan Pedro Cerro Martínez
 * @version 23/02/2022
 */
public class Grado extends Programa
{

    private String salidasProfesionales;
    
    /**
     * Constructor de la clase Grado
     * 
     * @param pTitulacion Nombre de la titulación
     * @param pDireccion Nombre de la persona que dirige el programa académico
     * @param pCreditos Número de créditos de la titulación
     * @param pSalidasProfesionales Lista de profesiones para las que habilita el Grado
     */
    public Grado(String pTitulacion, String pDireccion, short pCreditos, String pSalidasProfesionales)
    {
        super(pTitulacion,pDireccion,pCreditos);
        setSalidasProfesional(pSalidasProfesionales);
        this.numGrados++;
    }

    /**
     * Método accesor de la propiedad "salidasProfesionales"
     * 
     * @return Devuelve el String de la propiedad "salidasProfesionales"
     */protected String getSalidasProfesionales(){
        return this.salidasProfesionales;
    }
    
    /**
     * Método instanciador de la propiedad "SalidasProfesionales"
     * 
     * @param pSalidasProfesionales Lista de profesiones para las que habilita el Grado 
     */
    public void setSalidasProfesionales(String pSalidasProfesionales){
        this.salidasProfesionales=pSalidasProfesionales;
    }
    
    /**
     * Método accesor del tipo de programa
     * 
     * @return Devuelve el String con el tipo de programa
     */
    public String getTipoPrograma(){
        return "Grado";
    }
}
