import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Linea {

    private LocalDate fecha;
    private LocalTime hora;
    private String usuario;
    private String mensaje;

    private static final String PATRON =
            "^(\\d{1,2}/\\d{1,2}/\\d{2}) (\\d{1,2}:\\d{2}) - (.*): (.*)$";

    private boolean ok;

    public Linea(String textoLinea) {

        Pattern patron = Pattern.compile(PATRON);
        Matcher coincidencias = patron.matcher(textoLinea);

        if (coincidencias.matches()) {

            fecha = LocalDate.parse(
                    coincidencias.group(1),
                    DateTimeFormatter.ofPattern("d/M/yy"));

            hora = LocalTime.parse(
                    coincidencias.group(2),
                    DateTimeFormatter.ofPattern("H:mm"));

            usuario = coincidencias.group(3).trim();
            mensaje = coincidencias.group(4);

            ok = true;
        } else {
            ok = false;
        }
    }

    public String getFecha() {

        if (!ok) {
            return "";
        }

        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getHora() {

        if (!ok) {
            return "";
        }

        return hora.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getUsuario() {
        return usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean esOk() {
        return ok;
    }

    public int numLetrasMensaje() {

        if (mensaje == null) {
            return 0;
        }

        return mensaje.length();
    }

    public int numPalabrasMensaje() {

        if (mensaje == null || mensaje.isEmpty()) {
            return 0;
        }

        return mensaje.split(" ").length;
    }

    @Override
    public String toString() {

        if (!ok) {
            return "Línea inválida";
        }

        return getFecha() + " "
                + getHora() + " - "
                + usuario + ": "
                + mensaje;
    }
}