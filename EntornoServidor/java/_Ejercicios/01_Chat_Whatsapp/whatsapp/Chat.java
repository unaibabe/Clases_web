package whatsapp;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
public class Chat
{
    private ArrayList<Linea> conversacion;
    private int numLineas;
    
    
    public Chat(String ruta){
         try {
            File file = new File(ruta);
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
                       
            String lineaW;
            Linea linea;
            this.conversacion = new ArrayList<Linea>();
            
            while((lineaW = buffer.readLine())!=null){
                //System.out.println("Empiezo el bucle: "+ lineaW);
                linea = new Linea(lineaW);
                this.conversacion.add(linea);
                this.numLineas++;
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer archivo");
        }
        
    }
        
    public int getNumLetras(){
        int contadorLetras=0;
        for(Linea l: this.conversacion){
            contadorLetras += l.numLetrasMensaje();
        }
        return contadorLetras;
    }
    
    public int getNumPalabras(){
        int contadorPalabras = 0;
        for(Linea l: this.conversacion){
            contadorPalabras += l.numPalabrasMensaje();
        }
        return contadorPalabras;
    }
    
    public int getNumeroLetras(String usuario){
        int contadorLetras = 0;
        for(Linea l: this.conversacion){            
            if(l.getUsuario().equals(usuario)){
                contadorLetras += l.numLetrasMensaje();
                //System.out.println("ESTOY EN EL IF");
            }
        }
        return contadorLetras;
    
    }
    
    public int getNumeroPalabras(String usuario){
        int contadorPalabras = 0;
        for(Linea l: this.conversacion){
            if(l.getUsuario().equals(usuario)){
                contadorPalabras += l.numPalabrasMensaje();
            }
        }
        return contadorPalabras;
    }
    
    public String[] getParticipantes(){
        ArrayList<String> participantes = new ArrayList<String>();
        
        for(Linea l : this.conversacion){
            
            if(!participantes.contains(l.getUsuario())){
                participantes.add(l.getUsuario());
            }
        }
        String[] usuarios = new String[participantes.size()];
        return participantes.toArray(usuarios);
        
    }
    
    public int numLineas(){
        return this.numLineas;
    }
    
    public ArrayList<Linea> getConversacion(){
        return this.conversacion;
    }

    public String toString(){
    String html = "";
    
    DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("d/M/yyyy");
    
    for(Linea l: this.conversacion){
        
        String fechaFormateada = l.getFecha().format(formatoDeseado);  
        html += "<div class='chat'>";
        html += "  <div class='chat-user'>" + l.getUsuario() + "</div>";
        html += "  <div class='chat-message'>" + l.getMensaje() + "</div>";
        html += "  <div class='chat-meta'>" + fechaFormateada + " - " + l.getHora() + "</div>";
        html += "</div>";
    }
    return html;
}

}