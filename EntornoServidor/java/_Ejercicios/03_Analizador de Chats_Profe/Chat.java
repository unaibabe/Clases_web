import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Chat {

    private ArrayList<Linea> conversacion;
    private int numLineas;

    public Chat(String rutaFichero) throws IOException {

        conversacion = new ArrayList<>();

        File fichero = new File(rutaFichero);
        BufferedReader lectura = new BufferedReader(new FileReader(fichero));

        String textoLinea;

        while ((textoLinea = lectura.readLine()) != null) {

            Linea linea = new Linea(textoLinea);

            if (linea.esOk()) {
                conversacion.add(linea);
            }
        }

        lectura.close();

        numLineas = conversacion.size();
    }

    public int getNumLetras() {

        int total = 0;

        for (Linea linea : conversacion) {
            total += linea.numLetrasMensaje();
        }

        return total;
    }

    public int getNumLetras(String usuario) {

        int total = 0;

        for (Linea linea : conversacion) {

            if (linea.getUsuario().equals(usuario)) {
                total += linea.numLetrasMensaje();
            }
        }

        return total;
    }

    public int getNumPalabras() {

        int total = 0;

        for (Linea linea : conversacion) {
            total += linea.numPalabrasMensaje();
        }

        return total;
    }

    public int getNumPalabras(String usuario) {

        int total = 0;

        for (Linea linea : conversacion) {

            if (linea.getUsuario().equals(usuario)) {
                total += linea.numPalabrasMensaje();
            }
        }

        return total;
    }

    public String[] getParticipantes() {

        ArrayList<String> participantes = new ArrayList<>();

        for (Linea linea : conversacion) {

            if (!participantes.contains(linea.getUsuario())) {
                participantes.add(linea.getUsuario());
            }
        }

        String[] resultado = new String[participantes.size()];

        for (int i = 0; i < participantes.size(); i++) {
            resultado[i] = participantes.get(i);
        }

        return resultado;
    }

    @Override
    public String toString() {

        String resultado = "";

        for (Linea linea : conversacion) {
            resultado += linea.toString() + "\n";
        }

        return resultado;
    }

    // EXTRA
    public int getNumLineas() {
       return numLineas;
    }

}