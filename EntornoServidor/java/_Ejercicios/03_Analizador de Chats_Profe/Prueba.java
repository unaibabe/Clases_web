public class Prueba {

    public static void main(String[] args) {

        try {

           System.out.println("Leyendo:"+args[0]);
	   Chat chat = new Chat(args[0]);


            System.out.println("=================================");
            System.out.println("ESTADÍSTICAS GENERALES DEL CHAT");
            System.out.println("=================================");

            System.out.println("Número de mensajes: "
                    + chat.getNumLineas());

            System.out.println("Número total de letras: "
                    + chat.getNumLetras());

            System.out.println("Número total de palabras: "
                    + chat.getNumPalabras());

            System.out.println();

            System.out.println("=================================");
            System.out.println("PARTICIPANTES");
            System.out.println("=================================");

            String[] participantes = chat.getParticipantes();

            for (int i = 0; i < participantes.length; i++) {

                String usuario = participantes[i];

                System.out.println();
                System.out.println(usuario);
                System.out.println("-------------------------");

                System.out.println("Letras escritas: "
                        + chat.getNumLetras(usuario));

                System.out.println("Palabras escritas: "
                        + chat.getNumPalabras(usuario));
            }

        } catch (Exception e) {

            System.out.println("Error al leer el fichero.");
            System.out.println(e.getMessage());
        }
    }
}