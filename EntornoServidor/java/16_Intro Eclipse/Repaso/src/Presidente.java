import java.time.LocalDate;

public class Presidente extends Vecino{
	private LocalDate fechaInicio, fechaFinal;

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public void quienSoy() {
		super.quienSoy();
		System.out.println("y soy presidente");
	}
	
	
}
