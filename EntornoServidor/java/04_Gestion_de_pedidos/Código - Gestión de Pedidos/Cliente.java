public class Cliente extends Persona {

    private String direccionFacturacion;
    private String cuentaBancaria;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos,
                   java.time.LocalDate fechaNacimiento,
                   String direccionFacturacion,
                   String cuentaBancaria) {

        super(nombre, apellidos, fechaNacimiento);
        this.direccionFacturacion = direccionFacturacion;
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setDireccion(String pDireccion) {
        this.direccionFacturacion = pDireccion;
    }

    public void setCuentaBacaria(String pCuenta) {
        this.cuentaBancaria = pCuenta;
    }

    public String getDireccion() {
        return direccionFacturacion;
    }

    public String getCuentaBacaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Cliente: " + super.toString() +
                " | Dirección: " + direccionFacturacion +
                " | Cuenta: " + cuentaBancaria;
    }
}