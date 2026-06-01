public class Ejemplo{
    public static void main (String[] args){
        int a = 7;
        float b = 8.5f;
        
        System.out.println(a == b);
        
        char letra = 'A';
        
        String c1 = "HOLA";
        String c2 = new String("HOLA");
        System.out.println(c1 == c2);// False son objetos diferentes
        System.out.println(c1.equals(c2));
        
        
        Casa casa_1 = new Casa(75,3,1);
        Casa casa_2 = new Casa(100,4,2);
        Casa casa_3 = new Casa(75,3,1);
        
        casa_1 = casa_2;
        
        System.gc(); // Limpiar la memoria osea en este caso como el puntero de casa_2 se ha perdido se limpia
        // El println ejecuta directamente el toString, no hace falta ponerlo
        System.out.println(casa_1.hashCode());
        System.out.println(casa_1.toString());// En exadecimal
        System.out.println(casa_1);
        System.out.println(casa_1==casa_2);
        System.out.println(casa_1.equals(casa_3));
        
        

        
    }
}