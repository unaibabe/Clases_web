import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract  class Persona
{
    protected String nombreCompleto;
    protected char sexo;
    protected LocalDate fechaNacimiento;
    protected int telefono;
    protected String correoElectronico;
    
    
    public Persona(String nombreCompleto, char sexo, LocalDate fechaNacimiento,int telefono, String correoElectronico){
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        this.fechaNacimiento = setFechaNacimiento(fechaNacimiento);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    protected String getNombreCompleto(){
        return this.nombreCompleto;
    }
    protected void setNombreCompleto(String pNombre){
        this.nombreCompleto = pNombre;
    }
    protected char getSexo(){
        return this.sexo;
    }
    protected void setSexo(char pSexo){
        this.sexo = pSexo;
    }
    protected LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    // ¡¡¡¡¡¡ MIRAR TIENE QUE DEVOLVER STRING !!!!!!
    // No localDate!!!!!!!!!!1
    protected void setFechaNacimiento(String pFecha){
        // DateTimeFormatter formatter
        try{
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd MM y");
        String text = LocalDate.parse(pFecha).format(formato);
        this.fechaNacimiento = LocalDate.parse(pFecha, formato);
        }
        catch (Exception e){
            System.out.println("La fecha de nacimiento " + this.fechaNacimiento + "no cumple con el formato");
        }
    }
    
    
    protected int getTelefono(){
        return this.telefono;
    }
    protected void setTelefono(int pTelefono){
        this.telefono = pTelefono;
    }
    protected String getCorreoElectronico(){
        return this.correoElectronico;
    }
    protected void setCorreoElectronico(String pCorreoElectronico){
        this.correoElectronico = pCorreoElectronico;
    }
    
    
    
}