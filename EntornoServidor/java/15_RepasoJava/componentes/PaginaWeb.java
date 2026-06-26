package componentes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class PaginaWeb {
   
    public String html() {
        String respuesta = new String();
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato  = DateTimeFormatter.ofPattern("d/M/y");
        String text = hoy.format(formato);
        // LocalDate fechaParseada = LocalDate.parse(text, formato);


        ArrayList<String> etiquetas = new ArrayList<String>();
        etiquetas.add("<html>");
        etiquetas.add("<head>");
        etiquetas.add("</head>");
        etiquetas.add("<body>");
        etiquetas.add("<h2>");
        etiquetas.add(text);
        etiquetas.add("</h2>");
        etiquetas.add("</body>");
        etiquetas.add("</html>");

        
        for(String elemento: etiquetas){
           respuesta+= elemento;
        }

        return respuesta;
    }    
}
