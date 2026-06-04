package java;

import static java.lang.Integer.parseInt;

/**
 * Clase para operaciones con dnis
 * @author unai
 * @version 03/06/2026
 */
public class Nif {
    private String nif;
    private String LETRAS= "TRWAGMYFPDXBNJZSQVHLCKE";

    /**
     * Methodo constructor
     * @param pNif
     */
    public Nif(String pNif){
        this.nif = pNif;
    }

    /**
     * Retorna el nif
     * @return nif
     */
    public String getNif(){
        return this.nif;
    }

    /**
     * Metodo para setear un nif
     * @param pNif
     */
    public void setNif(String pNif){
        this.nif = pNif;
    }

    /**
     * Metodo para obtener la letra del dni introducido
     * @return la letra del dni que tiene la clase
     */
    public char getLetra(){
        char letra = this.nif.charAt(this.nif.length()-1);
        return letra;
    }

    /**
     * Metodo para calcular que letra deberia tener el dni
     * @return la letra que deberia tener
     */
    public char calcularLetra(){
        String numerosDni = this.nif.substring(0,8);
        //System.out.println(numerosDni);
        int numeroParaCalculoLetra = parseInt(numerosDni)%23;
        char letraCalculada = LETRAS.charAt(numeroParaCalculoLetra);
        return letraCalculada;
    }

    /**
     * Metodo para comparar si la letra que tiene el dni y la que deberia tener coinciden
     * @return booleano true si es verdadero y false si no coincide
     */
    public boolean esValido(){
        return (getLetra()==calcularLetra());
    }

}
