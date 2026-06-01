import java.util.ArrayList;

public class Pedido {

    private int codigo;
    private Cliente cliente;
    private Trabajador trabajador;
    private ArrayList<LineaPedido> lineas;

    public Pedido() {
        lineas = new ArrayList<>();
    }

    public Pedido(int codigo, Cliente cliente, Trabajador trabajador) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.lineas = new ArrayList<>();
    }

    public void setCodigo(int pCodigo) {
        this.codigo = pCodigo;
    }

    public void setCliente(Cliente pCliente) {
        this.cliente = pCliente;
    }

    public void setTrabajador(Trabajador pTrabajador) {
        this.trabajador = pTrabajador;
    }

    public boolean agregarLinea(LineaPedido pLinea) {

        if (pLinea != null) {
            lineas.add(pLinea);
            return true;
        }

        return false;
    }

    public boolean eliminarLinea(LineaPedido pLinea) {

        return lineas.remove(pLinea);
    }

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

    public float calcularTotal() {

        float total = 0;

        for (LineaPedido lp : lineas) {
            total += lp.calcularSubtotal();
        }

        return total;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("PEDIDO ").append(codigo).append("\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Trabajador: ").append(trabajador.getNombre()).append("\n");

        sb.append("Líneas:\n");

        for (LineaPedido lp : lineas) {
            sb.append(" - ").append(lp).append("\n");
        }

        sb.append("TOTAL: ").append(calcularTotal()).append("€");

        return sb.toString();
    }
}