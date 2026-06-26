package catalogo;

public class Curso {
	private String imagenUrl;
	private String nombreCruso;
	private String[] etiquetas;
	private String detallesCurso;
	
	public Curso(String texto) {

		String[] partes = texto.split(";");
		nombreCruso = partes[1];
		imagenUrl = partes[0];
		
		etiquetas = new String[3];
		etiquetas[0] = partes[2];
		etiquetas[1] = partes[3];
		etiquetas[2] = partes[4];
		
		detallesCurso = partes[5];
	
		
	}
	public Curso() {}

	public String getImagenUrl() {
		return imagenUrl;
	}

	public String getNombreCruso() {
		return nombreCruso;
	}
	String getDetallesCurso() {
		return detallesCurso;
	}

	
	public String getEtiqueta(int numero) {
		return etiquetas[numero-1];
	}
	
	@Override
	public String toString() {
//		return "El nombre del curso: " + this.nombreCruso + "\nEl detalle del curso: "+ this.detallesCurso ;
		String html= new String();
		html += """
					    <div class="tarjeta">
					        <div class="imagen">
					            <img src=""";
		html+= "\""+ getImagenUrl()+ "\""+">";
				
		html+="""
					        </div>
					        
					        <div class="texto">
					            <h3>
					            """ + this.nombreCruso +"</h3>";
		html+="""
					            <hr>
					            <div class="contenedor-etiquetas">""";
		html+="""
					                <p class="etiqueta">"""+this.etiquetas[0]+"""
					                </p>
					                <p class="etiqueta">"""+this.etiquetas[1]+"""
					                </p>
					                <p class="etiqueta">"""+this.etiquetas[2]+"""
					                </p>
					            </div>
					            <p>
					            """+this.detallesCurso+"""
					            </p>
					            <div class="boton">Mas info</div>
					        </div>
					    </div>


					
				""";
		return html;
		
	}
	

}
