
/**
 * Write a description of class Departamento here.
 * 
 * @author unai 
 * @version 08/06/2026
 */
public class Departamento
{
    private String nombre;
    private String descripcion;
    private Departamento dependencia;
    private Trabajador responsable;
    
    public Departamento(String nombre, String descripcion, Departamento dependencia, Trabajador responsable){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dependencia = dependencia;
        this.responsable = responsable;
    }
    /**
     * @return Nos da el nombre del departamento
     */
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
    /**
     * @return la descipcion del departamento
    */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public void setDescripcion(String pDescripcion){
    this.descripcion = pDescripcion;}
        /**
     * @return  la dependencia que tiene en el departamento respecto a el departamento
    */
    public Departamento getDependencia(){
        return this.dependencia;
    }
    
    public void setDependencia(Departamento pDepartamento){
     this.dependencia=pDepartamento;
    }

    /**
     * @return la responsabilidad del trabajador
    */
    public Trabajador getResponsable(){
        return this.responsable;
    }
    
    /**
     * @param 
    */
    public void setResponsable(Trabajador pTrabajador){
        // faltaria el if para si ya hay responsabilidad pero no lo he sacadado
        this.responsable = pTrabajador;
        if(this.responsable!=null){
            pTrabajador.setResponsabilidad(true);
        }
    }
    
    
    
}