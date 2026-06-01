public class Producto {

    private String nombre;
    private float precio;

    public Producto() {
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public void setPrecio(float pPrecio) {
        this.precio = pPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - " + precio + "€";
    }
}