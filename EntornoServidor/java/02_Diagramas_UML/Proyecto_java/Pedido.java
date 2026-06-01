// Pedido.java
import java.util.ArrayList;

public class Pedido {

    // Propiedades
    private int codigo;
    private Cliente cliente;
    private Trabajador trabajador;
    private ArrayList<LineaPedido> lineas;

    // Constructor vacío
    public Pedido() {
        lineas = new ArrayList<>();
    }

    // Constructor con parámetros
    public Pedido(int codigo, Cliente cliente, Trabajador trabajador) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.lineas = new ArrayList<>();
    }

    // Setters
    public void setCodigo(int pCodigo) {
        this.codigo = pCodigo;
    }

    public void setCliente(Cliente pCliente) {
        this.cliente = pCliente;
    }

    public void setTrabajador(Trabajador pTrabajador) {
        this.trabajador = pTrabajador;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    // Métodos
    public boolean agregarLinea(LineaPedido linea) {
        return lineas.add(linea);
    }

    public boolean eliminarLinea(LineaPedido linea) {
        return lineas.remove(linea);
    }

    public float calcularTotal() {
        float total = 0;

        for (LineaPedido lp : lineas) {
            total += lp.calcularSubtotal();
        }

        return total;
    }
}