package publicaciones;

public class Periodicos extends Publicacion implements Periodicidad{
	private String secciones, editor, periodicidad;
	
	public String getSecciones() {
		return secciones;
	}

	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(String f) {
		periodicidad = f;
		
	}

	
}//class
