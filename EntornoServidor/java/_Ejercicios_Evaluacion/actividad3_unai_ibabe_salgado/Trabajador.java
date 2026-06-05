import java.time.LocalDate;
/**
 * Write a description of class Trabajador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajador extends Persona
{
    private Departamento departamento;
    private float salario;
    private String numeroSS;
    private LocalDate fechaAlta;
    private boolean esResponsable;
    
    public Trabajador(String nombre, char sexo, LocalDate fechaNacimiento, int telefono, String correoElectronico ,Departamento departamento, float salario, String numeroSS, LocalDate fechaAlta, boolean esResponsable){
        super(nombre, sexo, fechaNacimiento, telefono, correoElectronico);
        this.departamento = departamento;
        this.salario = salario;
        this.numeroSS = numeroSS;
        this.fechaAlta = fechaAlta;
        this.esResponsable = esResponsable;
    }
    
    public Departamento getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(Departamento pDepartamento){
        this.departamento = pDepartamento;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float pSalario){
        this.salario= pSalario;
    }
    public String getNumeroSS(){
        return this.numeroSS;
    }
    public void setNumeroSS(String pNumeroSS){
        this.numeroSS = pNumeroSS;
    }
    public LocalDate getFechaAlta(){
        return this.fechaAlta;
    }
    public void setFechaAlta(LocalDate pFechaAlta){
        this.fechaAlta = pFechaAlta;
    }
    public boolean esResponsable(){
        return this.esResponsable;
    }
    public void setResponsabilidad(boolean pResponsabilidad){
        this.esResponsable = pResponsabilidad;
    }
    
    
    
    
}