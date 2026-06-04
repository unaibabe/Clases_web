package java;

public class Pruebas {
    public static void main(String[] args){
        Nif nid_1 = new Nif("87654321X");

//        System.out.println(nid_1.getLetra());
        System.out.println(nid_1.calcularLetra());
        System.out.println(nid_1.esValido());
    }
}
