<%@ page language = "java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <meta name="auhtor" content="UNAI" />
    <meta name="personaFavorita" content="SUPERMAN" />
    <title>Mi primera wev jsp</title>

  </head>
  <body>
    <h1>Esta es mi primera pagina web dinamica en JAVA</h1>
    <% 
    out.println("HOLA");
    
    class Clase{
      public Clase(){
      }
    }
    Clase objeto = new Clase();
    %>

    <%@ page import="java.util.Date" %>

    <%

      Date fecha = new Date();
      out.println(fecha + "<br>");

      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/y hh:mm:ss");
      out.println("Hoy es: " + formato.format(fecha)+ "<br>");

      /*for(int x = 1; x<=10; x++ ){
        out.println("Hoy es: " + formato.format(fecha)+ "<br>");
      }*/
    

    %>
    <h2 id="demo">Fecha actual <%=formato.format(fecha) %></h2>
    <button onclick="imprimirFecha()">Calcular Hora</button>
    <script>
      function imprimirFecha(){
        var d = new Date();
        document.getElementById("demo").innerHTML = d.getDate() + "/" + (d.getMonth() + 1) + "/" + d.getFullYear() + " " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
      }
      setInterval(imprimirFecha, 100);


    </script>
  </body>
</html>
