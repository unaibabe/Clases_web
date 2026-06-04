public abstract class FabricarWeb
{
    private static String html;
    
    public static void main(String[] args){
    String html = new String();
    html = "<!DOCTYPE html><html><head><meta charset='UTF-8'<title>"+args[0] +"</title></head>";
    html += "<body><header><h1>"+args[1]+"</h1></header><main>";
    int secciones = Integer.parseInt(args[2]);
    int articulos = Integer.parseInt(args[3]);
    
    for (int contador_secciones=1; contador_secciones<= secciones;contador_secciones++){
        html += "<section>Seccion " + contador_secciones;
        for (int contador_articulos=1;contador_articulos<=articulos;contador_articulos++){
        html += "<article> Articulo "+ contador_articulos + "</article>";
        }
        html += "</section></main>";
        }
    System.out.println(html);
    }

    
    
}