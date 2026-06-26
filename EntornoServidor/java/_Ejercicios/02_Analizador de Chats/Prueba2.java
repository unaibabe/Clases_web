import whatsapp.*;
public class Prueba2 {

    public static void main(String[] args) {
        PruebasMensajesDia grafica1 = new PruebasMensajesDia("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt", "mensajeDia");
        System.out.println(grafica1.generarContenido(500,500));
        // System.out.println(grafica1.script());
    }
}