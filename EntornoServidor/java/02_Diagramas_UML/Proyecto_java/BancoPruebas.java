// BancoPruebas.java
import java.util.Date;

public class BancoPruebas {

    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Carlos");
        cliente.setApellidos("Martinez");
        cliente.setDireccion("Calle Mayor 10");
        cliente.setCuentaBancaria("ES123456789");

        // Crear trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ana");
        trabajador.setApellidos("Lopez");
        trabajador.setDepartamento("Ventas");
        trabajador.setSalario(1800.50f);
        trabajador.setJornada("Completa");

        // Crear productos
        Producto p1 = new Producto("Portatil", 850.0f);
        Producto p2 = new Producto("Ratón", 25.0f);

        // Crear líneas de pedido
        LineaPedido lp1 = new LineaPedido(p1, 1, 10);
        LineaPedido lp2 = new LineaPedido(p2, 2, 5);

        // Crear pedido
        Pedido pedido = new Pedido();
        pedido.setCodigo(1001);
        pedido.setCliente(cliente);
        pedido.setTrabajador(trabajador);

        // Agregar líneas
        pedido.agregarLinea(lp1);
        pedido.agregarLinea(lp2);

        // Mostrar información
        System.out.println("===== PEDIDO =====");
        System.out.println("Código: " + pedido.getCodigo());

        System.out.println("Cliente: "
                + pedido.getCliente().getNombre()
                + " "
                + pedido.getCliente().getApellidos());

        System.out.println("Trabajador: "
                + pedido.getTrabajador().getNombre());

        System.out.println("\nProductos:");

        for (LineaPedido lp : pedido.getLineas()) {
            System.out.println(
                    lp.getProducto().getNombre()
                    + " | Cantidad: " + lp.getCantidad()
                    + " | Precio: " + lp.getProducto().getPrecio()
                    + " | Subtotal: " + lp.calcularSubtotal()
            );
        }

        System.out.println("\nTOTAL PEDIDO: " + pedido.calcularTotal() + " €");
    }
}