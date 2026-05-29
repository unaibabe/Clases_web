// Trabajador.java
public class Trabajador extends Persona {

    // Propiedades
    private String departamento;
    private float salario;
    private String jornada;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor con parámetros
    public Trabajador(String departamento, float salario, String jornada) {
        this.departamento = departamento;
        this.salario = salario;
        this.jornada = jornada;
    }

    // Setters
    public void setDepartamento(String pDepartamento) {
        this.departamento = pDepartamento;
    }

    public void setSalario(float pSalario) {
        this.salario = pSalario;
    }

    public void setJornada(String pJornada) {
        this.jornada = pJornada;
    }

    // Getters
    public String getDepartamento() {
        return departamento;
    }

    public float getSalario() {
        return salario;
    }

    public String getJornada() {
        return jornada;
    }
}