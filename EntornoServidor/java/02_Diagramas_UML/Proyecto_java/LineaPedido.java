// LineaPedido.java
public class LineaPedido {

    // Propiedades
    private Producto producto;
    private int cantidad;
    private float descuento;

    // Constructor vacío
    public LineaPedido() {
    }

    // Constructor con parámetros
    public LineaPedido(Producto producto, int cantidad, float descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    // Setters
    public void setProducto(Producto pProducto) {
        this.producto = pProducto;
    }

    public void setCantidad(int pCantidad) {
        this.cantidad = pCantidad;
    }

    public void setDescuento(float pDescuento) {
        this.descuento = pDescuento;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    // Método para calcular subtotal
    public float calcularSubtotal() {
        float subtotal = producto.getPrecio() * cantidad;
        subtotal = subtotal - (subtotal * descuento / 100);
        return subtotal;
    }
}// Trabajador.java
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