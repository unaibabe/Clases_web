// Producto.java
public class Producto {

    // Propiedades
    private String nombre;
    private float precio;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Setters
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setPrecio(float pPrecio) {
        this.precio = pPrecio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}