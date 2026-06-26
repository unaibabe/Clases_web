
public class Comunidad {

	public static void main(String[] args) {
		Vecino juan = new Vecino();
		juan.setNombre("Juan");
		juan.setApellidos("Garcia");
		//juan.quienSoy();
		juan.votar();
		
		//System.out.println(juan.getNombre());
		Presidente maria = new Presidente();
		maria.setNombre("Maria");
		maria.setApellidos("Ruiz");
		//maria.quienSoy();
		maria.pagar();
				
		
	}
}
