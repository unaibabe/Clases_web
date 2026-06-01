import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setApellidos(String pApellidos) {
        this.apellidos = pApellidos;
    }

    public void setFechaNacimiento(String pFecha) {
        this.fechaNacimiento = LocalDate.parse(pFecha);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaNacimientoTexto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaNacimiento.format(formatter);
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + getFechaNacimientoTexto() + ")";
    }
}