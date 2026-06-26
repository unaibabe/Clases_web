
public class Contador {

	public static void main(String[] args) {
		int contador = 0;
		int y = 2;
		for(contador=1; contador<=10; contador++) {
			System.out.println(contador);
			y=y*2;
			if(contador>5) {
				break;
			}
			
		}
		System.out.println("El contador ha quedado en: "+contador);

	}

}
