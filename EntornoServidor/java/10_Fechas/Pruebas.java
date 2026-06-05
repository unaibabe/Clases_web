import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.*;
import java.time.*;
public class Pruebas
{
    public static void main(String[] args){
        Date fecha1 = new Date("1/1/2023");
        Date fecha2 = new Date("30 jun 2023");
        Date fechaHoy = new Date();
        
        //System.out.println(fecha2);
        // Comparar cual es mas grande
        //System.out.println(fecha1.compareTo(fecha2));//-1 es menor, 0 es igual, 1 es mayor
        //System.out.println(fecha2);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("y");
        System.out.println(formatoFecha.format(fecha2));
        
        formatoFecha = new SimpleDateFormat("d/M/y");
        System.out.println(formatoFecha.format(fecha2));
        
        formatoFecha = new SimpleDateFormat("'Hoy es: ' EEEE dd ' de ' MMMM",Locale.JAPANESE);
        System.out.println(formatoFecha.format(fechaHoy));
        
        System.out.println("=========================");
        System.out.println(" FECHAS DE MANERA MODERNA ");
        System.out.println("=========================");
        
        LocalDate fecha = LocalDate.now();
        //System.out.println(fecha);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd' de 'MMMM' de 'y", new Locale("es", "ES"));
        System.out.println(fecha.format(formato));
        System.out.println("--------------------------");
        fecha = fecha.plusDays(154);
        System.out.println(fecha);
        System.out.println("--------------------------");
        
        try{
            fecha=LocalDate.parse("10 de octubrede 2028", formato);
            System.out.println(fecha);
        }
        catch(DateTimeParseException e){
            System.out.println("No se pudo ejecutar por: " +e.getMessage().toUpperCase());
        }
        
        System.out.println("=========================");
        System.out.println("Cuantos años tengo");
        System.out.println("=========================");
        
        LocalDate ahora = LocalDate.now();
        LocalDate nacido = LocalDate.of(1992,9,27);
        
        Period diferencia = Period.between(nacido, ahora);
        System.out.println(diferencia.getDays());
        
    }
}