public class Vecino implements IResidentes{
	
	private String nombre,apellidos;
	private String iban;
	private double saldo;
	
	public Vecino(String nombre, String apellidos, String iban, double saldo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.iban = iban;
		this.saldo = saldo;
	}
	public Vecino() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void quienSoy() {
		System.out.println("Soy "+ getNombre()+ " " + getApellidos());
	}
	public void votar() {
		System.out.println("Soy "+ getNombre()+ " y ya he votado");
	}
	
	public void pagar(){
		System.out.println("Soy "+ getNombre()+ " y ya he pagado");
	}	
}
