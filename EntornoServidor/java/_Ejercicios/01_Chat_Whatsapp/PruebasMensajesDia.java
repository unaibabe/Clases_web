import java.util.Map;
import java.util.TreeMap;

import whatsapp.Chat;
import whatsapp.Linea;

public class PruebasMensajesDia {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> mensajesXDia = new TreeMap<String, Integer>();
        Chat chat = new Chat("C:\\xampp\\tomcat\\webapps\\ROOT\\chat.txt\\");
        int contador = 1;
        for(Linea l: chat.getConversacion()){
            if(!mensajesXDia.containsKey(l.getFecha().toString())){
                mensajesXDia.put(l.getFecha().toString(),contador );
            }
            else{
                mensajesXDia.put(l.getFecha().toString(),contador++);
            }
            
        }
        for(int i= 0; i<= mensajesXDia.size();i++){
            System.out.println("Fecha: " + mensajesXDia.values().toArray()[i] +"\nNumero de Mensajes: " + mensajesXDia.values().toArray()[i]);
        }
    }
}
    

