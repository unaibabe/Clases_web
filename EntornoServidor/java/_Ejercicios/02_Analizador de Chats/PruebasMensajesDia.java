import java.util.Map;
import java.util.TreeMap;


public class PruebasMensajesDia {
        
    private TreeMap<String, Integer> mensajesXDia = new TreeMap<String, Integer>();
    private String nombreContenedor;

    public PruebasMensajesDia(String rutaChat, String nombreContenedor) {
        this.nombreContenedor = nombreContenedor;
        
	    Chat chat = new Chat(rutaChat);
 
        for(Linea l: chat.getConversacion()){
            if(!mensajesXDia.containsKey(l.getFecha().toString())){
                mensajesXDia.put(l.getFecha().toString(),1 );
            }
            else{
                mensajesXDia.put(l.getFecha().toString(),mensajesXDia.get(l.getFecha())+1);
                // System.out.println("MENSAJE DE FECHA: "+mensajesXDia.get(l.getFecha()));
            }
            
        }
    }

    public String generarContenido(){
        String respuesta = new String();
        respuesta = "<div id=\""+this.nombreContenedor+"\"></div>";
        return respuesta;
    }
    
    public String getDatosGrafica(){
        int contador = 1;
        String datosGrafico = new String();

        for(String fecha: mensajesXDia.keySet()){
            if(contador < mensajesXDia.size()){
                datosGrafico += "['"+fecha + "'," + mensajesXDia.get(fecha)+"]," ;
                contador ++;
            }
            else{
                datosGrafico +="['"+fecha + "'," + mensajesXDia.get(fecha)+"]" ;
            }
            
        }
        return datosGrafico;
    // for(int i= 0; i<= mensajesXDia.size();i++){
    //     System.out.println("Fecha: " + mensajesXDia.keySet().toArray()[i] +"\nNumero de Mensajes: " + mensajesXDia.values().toArray()[i]);
    // }
        
    }

        
}
    

