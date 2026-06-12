package whatsapp;

import java.time.LocalDate;
import java.util.regex.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Linea {
    private LocalDate fecha;
    private LocalTime hora;
    private String usuario;
    private String mensaje;
    private final String PATRON = "(\\d{1,2}\\/\\d{1,2}\\/\\d{2}) (\\d{1,2}:\\d{2}) - (.*): (.*$)";
    private Boolean ok;

    public Linea(String linea) {
        Matcher m = Pattern.compile(PATRON).matcher(linea);
        this.ok = m.matches();

        if (this.ok) {
            // Fecha
            String fecha = m.group(1);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/y");
            this.fecha = LocalDate.parse(fecha, formato);
            // Hora
            String hora = m.group(2);
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("H:m");
            this.hora = LocalTime.parse(hora, formatoHora);
            // Usuario
            this.usuario = m.group(3);
            // Mensaje
            this.mensaje = m.group(4);
        }

    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public Boolean esOk() {
        return this.ok;
    }

    public int numLetrasMensaje() {
        // int letras = 0;
        // for(int i = 0; i<this.mensaje.length();i++){
        // letras ++;
        // }

        return this.mensaje.length();

    }

    public int numPalabrasMensaje() {
        String[] palabras = this.mensaje.split(" ");
        return palabras.length;
    }

}