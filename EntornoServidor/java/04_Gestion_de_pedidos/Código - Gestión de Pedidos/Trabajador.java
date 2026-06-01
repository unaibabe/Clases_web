public class Trabajador extends Persona {

    private String departamento;
    private float salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellidos,
                      java.time.LocalDate fechaNacimiento,
                      String departamento,
                      float salario) {

        super(nombre, apellidos, fechaNacimiento);
        this.departamento = departamento;
        this.salario = salario;
    }

    public void setDepartamento(String pDepartamento) {
        this.departamento = pDepartamento;
    }

    public void setSalario(float pSalario) {
        this.salario = pSalario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Trabajador: " + super.toString() +
                " | Departamento: " + departamento +
                " | Salario: " + salario;
    }
}