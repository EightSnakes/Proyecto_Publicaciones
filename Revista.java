package publicaciones;

public class Revista extends Publicacion implements Periodicidad{
	private String ISSN, periodicidad;
	private int numero, anio;
	
	public String getISSN() {
		return ISSN;
	}
	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	public String getPeriodicidad() {
		return periodicidad;
	}
	@Override
	public void setPeriodicidad(String f) {

		periodicidad = f;
		
	}
	
}//class
