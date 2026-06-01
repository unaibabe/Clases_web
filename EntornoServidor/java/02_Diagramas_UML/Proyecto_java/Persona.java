// Persona.java
import java.util.Date;

public class Persona {
    // Propiedades
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellidos, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos setter
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setApellidos(String pApellidos) {
        this.apellidos = pApellidos;
    }

    public void setFechaNacimiento(Date pFecha) {
        this.fechaNacimiento = pFecha;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaNacimientoTexto() {
        return fechaNacimiento.toString();
    }
}