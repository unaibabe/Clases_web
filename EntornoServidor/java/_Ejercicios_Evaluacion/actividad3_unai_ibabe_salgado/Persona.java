import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version 08/06/2026
 */
public abstract  class Persona
{
    protected String nombreCompleto;
    protected char sexo;
    protected LocalDate fechaNacimiento;
    protected int telefono;
    protected String correoElectronico;
    
    
    public Persona(String nombreCompleto, char sexo, String fechaNacimiento,int telefono, String correoElectronico){
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        setFechaNacimiento(fechaNacimiento);
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    /**
     * @return da el nombre completo de la persona
     */
    protected String getNombreCompleto(){
        return this.nombreCompleto;
    }
    /**
     * @param nombre de la persona en tipo String
     */
    protected void setNombreCompleto(String pNombre){
        this.nombreCompleto = pNombre;
    }
    /**
     * @return da el sexo de la persona en tipo char, no esta definido asi que puedes poner lo que quieras
     */
    protected char getSexo(){
        return this.sexo;
    }
    /**
     * @param poner un char para indicar el sexo 
     */
    protected void setSexo(char pSexo){
        this.sexo = pSexo;
    }
    /**
     * @return la fecha en formato string
     */
    protected String getFechaNacimiento(){
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/y");
        
        //this.fechaNacimiento = LocalDate.parse(this.fechaNacimiento,formato);
        //try{
        //    LocalDate fechaNacido = LocalDate.parse(this.fechaNacimiento.toString(),formato);
        //System.out.println("FECHA NACIMIENTO: " + fechaNacido);
        //    return this.fechaNacimiento.format(formato);
        //}
        //catch(Exception e){
            //System.out.println(e);
          //  return null;
        //}
        
        return this.fechaNacimiento.format(formato);
    }
    // ¡¡¡¡¡¡ MIRAR TIENE QUE DEVOLVER STRING !!!!!!
    // No localDate!!!!!!!!!!
    /**
     * @param la fecha en formato string con la estructura dd/mm/aaaa
     */
    protected void setFechaNacimiento(String pFecha){
        // DateTimeFormatter formatter
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/y");
        try{
            this.fechaNacimiento = LocalDate.parse(pFecha, formato);
        //System.out.println("Fecha añadidida: " + this.fechaNacimiento);
        }
        catch (Exception e){
            System.out.println("La fecha de nacimiento " + pFecha + " no cumple con el formato 'dd/mm/aaaa'");
        }
    }
    
    /**
     * @return el telefono en tipo int
     */
    protected int getTelefono(){
        return this.telefono;
    }
    /**
     * @param el telefono en int
     */
    protected void setTelefono(int pTelefono){
        this.telefono = pTelefono;
    }
    /**
     * @return da una String con el  correo electronico
     */
    protected String getCorreoElectronico(){
        return this.correoElectronico;
    }
    /**
     * @param ponemos un String con el correo
     */
    protected void setCorreoElectronico(String pCorreoElectronico){
        this.correoElectronico = pCorreoElectronico;
    }
    
    
    
}