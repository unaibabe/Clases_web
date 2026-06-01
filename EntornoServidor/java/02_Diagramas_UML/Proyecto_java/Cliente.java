// Cliente.java
public class Cliente extends Persona {

    // Propiedades
    private String direccionFacturacion;
    private String cuentaBancaria;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String direccionFacturacion, String cuentaBancaria) {
        this.direccionFacturacion = direccionFacturacion;
        this.cuentaBancaria = cuentaBancaria;
    }

    // Setters
    public void setDireccion(String pDireccion) {
        this.direccionFacturacion = pDireccion;
    }

    public void setCuentaBancaria(String pCuentaBancaria) {
        this.cuentaBancaria = pCuentaBancaria;
    }

    // Getters
    public String getDireccion() {
        return direccionFacturacion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
}