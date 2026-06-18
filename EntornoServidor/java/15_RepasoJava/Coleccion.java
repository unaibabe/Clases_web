import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Coleccion {
    public static void main(String[] args) {
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
            System.out.println(elemento);
        }
    }    
}
