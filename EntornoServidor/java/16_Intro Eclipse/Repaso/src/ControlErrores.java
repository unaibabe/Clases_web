public abstract class ControlErrores{
	
	private static void mensaje(String m) {
		System.out.println(m);
	}
	private static void mensaje(Number m) {
		System.out.println(m);
	}
	
	private static void calcular() {
		int resultado = (int)10.0/2;
		mensaje(resultado);
		Integer i = Integer.parseInt("5x");
		System.out.println(i);		
		
	}
	public static void main(String[] args) {
		try {
		calcular();
		} catch(ArithmeticException e) {
			mensaje("Error aritmetico");
		} catch(NumberFormatException e) {
			mensaje("No se puede convertir el numero");
		}
	}
}