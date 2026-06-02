
/**
 * Clase que instancia una universidad
 * 
 * @author Juan Pedro Cerro Martínez
 * @version 23/02/2022
 */
public class Universidad {
    public static void main(String args[]){
        Grado gradoInformatica=new Grado("Grado en Informática","Director/a 1",(short)180,"Consultor/a, programador/a, analista TI, administrador/a redes...");
        Grado gradoPsicologia=new Grado("Grado en Psicología","Director/a 1",(short)180,"Psicología clínica y educativa, psicooncología, psicogerontología...");
        Master masterSmartCities=new Master("Máster en Ciudades Inteligentes", "Director/a 3", (short)60,"Sociotecnológico",'I');
        Master masterRenovables=new Master("Máster en Energías Renovables", "Director/a 4", (short)60,"Medioambiental",'P');
        
        System.out.println("RESUMEN DE PROGRAMAS DE LA UNIVERSIDAD:");
        System.out.println("---------------------------------------\n");
        System.out.println("GRADOS:\n\t"+gradoInformatica.getTitulacion()+" ("+gradoInformatica.getCreditos()+" ECTS)\n\t"+
        gradoPsicologia.getTitulacion()+" ("+gradoPsicologia.getCreditos()+" ECTS)");
        System.out.println("MASTERS:\n\t"+masterSmartCities.getTitulacion()+" ("+masterSmartCities.getEspecialidad()+")\n\t"+
        masterRenovables.getTitulacion()+" ("+masterRenovables.getEspecialidad()+")\n");
        System.out.println("TOTAL: "+Programa.numGrados+" grados y "+Programa.numMasters+" masters");
    }
}
