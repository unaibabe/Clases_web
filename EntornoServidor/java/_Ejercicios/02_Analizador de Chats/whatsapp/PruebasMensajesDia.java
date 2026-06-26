package whatsapp;
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

    public String generarContenido(int alto, int ancho){
        String respuesta = new String();
        respuesta = "<div id=\""+this.nombreContenedor+"\" style=\"width:"+ancho+"px; height:"+alto+"px\"></div>";
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
        // PRUEBA CON OTRO FOR
    // for(int i= 0; i<= mensajesXDia.size();i++){
    //     System.out.println("Fecha: " + mensajesXDia.keySet().toArray()[i] +"\nNumero de Mensajes: " + mensajesXDia.values().toArray()[i]);
    // } 

    }
    public String script(){
        String respuesta = new String();
        
        respuesta = 
        """      
    <script type="text/javascript" src=\"https://www.gstatic.com/charts/loader.js"></script>
    <script type=\"text/javascript\">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(""";
        
      respuesta += nombreContenedor+");\n";
        respuesta += "function "+ nombreContenedor + "()"+
        """
        {
        var data = google.visualization.arrayToDataTable([
          ['Fecha', 'Mensajes'],
                  """;

        respuesta += getDatosGrafica();          
         respuesta += 
          """             
        ]);

        var options = {
          title: 'Mensajes whatsapp',
        //   colors: ['#008069'], 
          
          annotations: {
            alwaysOutside: false, // Forzar a que intente meterse dentro de la barra
            textStyle: {
              fontSize: 13,
              bold: true,
              color: '#ffffff' // Blanco contrasta mejor si el fondo de la barra es verde
            }
          },
          
          hAxis: {
            slantedText: true,
            slantedTextAngle: 45
          }
        };

        var chart = new google.visualization.ColumnChart(document.getElementById('""";
                
                
        respuesta +=nombreContenedor + "'));\n";
        respuesta +=
        """
        chart.draw(data, options);
      }
    </script>
                """;
                
                
        
        return respuesta;

    }

        
}
    

