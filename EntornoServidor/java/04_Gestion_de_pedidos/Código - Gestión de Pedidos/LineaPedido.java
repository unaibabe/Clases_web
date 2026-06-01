public class LineaPedido {

    private Producto producto;
    private int cantidad;
    private float descuento;

    public LineaPedido() {
    }

    public LineaPedido(Producto producto, int cantidad, float descuento) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public void setProducto(Producto pProducto) {
        this.producto = pProducto;
    }

    public void setCantidad(int pCantidad) {
        this.cantidad = pCantidad;
    }

    public void setDescuento(float pDescuento) {
        this.descuento = pDescuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public float calcularSubtotal() {
        float subtotal = producto.getPrecio() * cantidad;
        return subtotal - (subtotal * descuento / 100);
    }

    @Override
    public String toString() {
        return producto.getNombre() +
                " | Cantidad: " + cantidad +
                " | Descuento: " + descuento + "%" +
                " | Subtotal: " + calcularSubtotal() + "€";
    }
}