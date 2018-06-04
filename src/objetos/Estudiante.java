package objetos;

public class Estudiante {

	private String id;
	private String nombre;
	private String apellidos;
	private String tipoEstudiante;
	private String clave;
	
	public Estudiante() {
		
	}

	public Estudiante(String id, String nombre, String apellidos, String tipoEstudiante, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoEstudiante = tipoEstudiante;
		this.clave = clave;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTipoEstudiante() {
		return tipoEstudiante;
	}

	public void setTipoEstudiante(String tipoEstudiante) {
		this.tipoEstudiante = tipoEstudiante;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipoEstudiante =" + tipoEstudiante
				+ ", clave=" + clave + "]";
	}

	
	

}
