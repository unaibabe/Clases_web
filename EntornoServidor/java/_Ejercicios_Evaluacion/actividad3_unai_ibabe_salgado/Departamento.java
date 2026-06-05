
/**
 * Write a description of class Departamento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Departamento
{
    private String nombre;
    private String descripcion;
    private Departamento dependencia;
    private Trabajador responsable;
    
    public Departamento(String nombre, String descripcion, Departamento dependencia, Trabajador respobsable){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dependencia = dependencia;
        this.responsable = responsable;
    }
    
    public String getNombre(){
    return this.nombre;
}
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
    public String getDescripcion(){
    return this.descripcion;}
    public void setDescripcion(String pDescripcion){
    this.descripcion = pDescripcion;}
    public Departamento getDependencia(){
        return this.dependencia;
    }
    public void setDependencia(Departamento pDepartamento){
     this.dependencia=pDepartamento;}
    public Trabajador getResponsable(){
    return this.responsable;}
    public void setResponsable(Trabajador pTrabajador){
        this.responsable = pTrabajador;
    }
    
    
    
}