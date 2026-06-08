import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class Trabajador here.
 * 
 * @author unai 
 * @version 08/06/2026
 */
public class Trabajador extends Persona
{
    private Departamento departamento;
    private float salario;
    private String numeroSS;
    private LocalDate fechaAlta;
    private boolean esResponsable;
    
    public Trabajador(String nombre, char sexo, String fechaNacimiento, int telefono, String correoElectronico ,
    Departamento departamento, float salario, 
    String fechaAlta, boolean esResponsable,String numeroSS){
        
        super(nombre, sexo, fechaNacimiento, telefono, correoElectronico);
        this.departamento = departamento;
        this.salario = salario;
        this.numeroSS = numeroSS;
        setFechaAlta(fechaAlta);
        this.esResponsable = esResponsable;
    }
    /**
     * @return Nos da el departamento del trabajador
     */
    public Departamento getDepartamento(){
        return this.departamento;
    }
    /**
     * @param se poner el Departamento al que pertenece el trabajador
     */
    public void setDepartamento(Departamento pDepartamento){
        this.departamento = pDepartamento;
    }
    /**
     * @return el salario del trabajador
     */
    public float getSalario(){
        return this.salario;
    }
    
        /**
     * @param el salario en tipo float
     */
    public void setSalario(float pSalario){
        this.salario= pSalario;
    }
    
    /**
     * @return el numero de la seguridad social 
     */
    public String getNumeroSS(){
        return this.numeroSS;
    }
        /**
     * @param pNumeroSS tipo String con el numero de la seguridad social
     */
    public void setNumeroSS(String pNumeroSS){
        this.numeroSS = pNumeroSS;
    }
    
    /**
     * @return la fecha en tipo local date
     */
    public LocalDate getFechaAlta(){
        return this.fechaAlta;
    }
    
        /**
     * @param pFechaAlta, la fecha en formato string con la forma que hemos especificado
     */
    public void setFechaAlta(String pFechaAlta){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/y");
        try{
        //String text = LocalDate.parse(pFecha).format(formato);
            this.fechaAlta = LocalDate.parse(pFechaAlta, formato);
        }
        catch (Exception e){
            System.out.println("La fecha de alta " + pFechaAlta + " no cumple con el formato 'dd/mm/aaaa'");
        }
    }
    /**
     * @return si es responsable o no 
     */
    public boolean esResponsable(){
        return this.esResponsable;
    }
        /**
     * @param si es resposable o no
     */
    public void setResponsabilidad(boolean pResponsabilidad){
        this.esResponsable = pResponsabilidad;
    }
    
    
    
    
}