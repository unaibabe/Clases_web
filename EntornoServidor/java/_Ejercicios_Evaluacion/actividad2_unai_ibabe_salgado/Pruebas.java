
/**
 * Write a description of class Pruebas here.
 * 
 * @author unai
 * @version 03/06/2026
 */

public class Pruebas {
    public static void main(String[] args){
        Nif nid_1 = new Nif("87654321X");
        Nif nid_2 = new Nif("12345678T");
//        System.out.println(nid_1.getLetra());
        System.out.println("============ NIF 1 ==========");
        System.out.println("La letra del dni intoducido: "+nid_1.calcularLetra());
        System.out.println("El dni introducido es valido? "+nid_1.esValido());
        System.out.println(nid_1.toString());
        System.out.println("============ NIF 2 ==========");
        System.out.println(nid_2.toString());
    }
}