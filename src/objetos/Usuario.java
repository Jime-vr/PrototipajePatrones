package objetos;

public class Usuario {

	private String id;
	private String nombre;
	private String apellidos;
	private String grupo;
	private String clave;
	
	
	public Usuario() {
		
	}


	public Usuario(String id, String nombre, String apellido, String grupo, String clave) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.grupo = grupo;
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


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellidos + ", grupo=" + grupo + ", clave="
				+ clave + "]";
	}


}
