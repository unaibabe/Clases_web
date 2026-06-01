import java.time.LocalDate;

public class BancoPruebas {

    public static void main(String[] args) {

        // =========================================
        // TEST PERSONA / CLIENTE / TRABAJADOR
        // =========================================

        Cliente cliente1 = new Cliente(
                "Juan",
                "Pérez",
                LocalDate.of(1990, 5, 10),
                "Calle Mayor 10",
                "ES123456789"
        );

        Trabajador trabajador1 = new Trabajador(
                "Ana",
                "Gómez",
                LocalDate.of(1985, 3, 20),
                "Ventas",
                2200.50f
        );

        System.out.println(cliente1);
        System.out.println(trabajador1);

        // =========================================
        // TEST PRODUCTOS
        // =========================================

        Producto p1 = new Producto("Portátil", 1200f);
        Producto p2 = new Producto("Ratón", 25f);
        Producto p3 = new Producto("Teclado", 80f);

        System.out.println("\nPRODUCTOS:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // =========================================
        // TEST LINEAS DE PEDIDO
        // =========================================

        LineaPedido lp1 = new LineaPedido(p1, 1, 10);
        LineaPedido lp2 = new LineaPedido(p2, 2, 5);
        LineaPedido lp3 = new LineaPedido(p3, 1, 0);

        System.out.println("\nLINEAS PEDIDO:");
        System.out.println(lp1);
        System.out.println(lp2);
        System.out.println(lp3);

        // =========================================
        // TEST PEDIDO
        // =========================================

        Pedido pedido1 = new Pedido(1001, cliente1, trabajador1);

        System.out.println("\nAñadiendo líneas...");
        System.out.println("LP1 añadida: " + pedido1.agregarLinea(lp1));
        System.out.println("LP2 añadida: " + pedido1.agregarLinea(lp2));
        System.out.println("LP3 añadida: " + pedido1.agregarLinea(lp3));

        // Intento de añadir null (rama false)
        System.out.println("NULL añadida: " + pedido1.agregarLinea(null));

        // Mostrar pedido
        System.out.println("\nDATOS PEDIDO:");
        System.out.println(pedido1);

        // =========================================
        // TEST ELIMINAR LINEA
        // =========================================

        System.out.println("\nEliminando LP2...");
        System.out.println("Resultado: " + pedido1.eliminarLinea(lp2));

        // Eliminar una línea inexistente
        System.out.println("Eliminar línea inexistente:");
        System.out.println(pedido1.eliminarLinea(lp2));

        // Estado final
        System.out.println("\nPEDIDO FINAL:");
        System.out.println(pedido1);

        // =========================================
        // TEST GETTERS / SETTERS
        // =========================================

        cliente1.setDireccion("Avenida Andalucía 55");
        trabajador1.setSalario(2500f);
        p1.setPrecio(999.99f);

        System.out.println("\nDATOS MODIFICADOS:");
        System.out.println(cliente1.getDireccion());
        System.out.println(trabajador1.getSalario());
        System.out.println(p1.getPrecio());
    }
}