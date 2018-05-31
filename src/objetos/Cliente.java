package objetos;

public class Cliente {

	private String id;
	private String nombre;
	private String apellidos;
	private String tipoCliente;
	private String clave;
	
	public Cliente() {
		
	}

	public Cliente(String id, String nombre, String apellidos, String tipoCliente, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipoCliente = tipoCliente;
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

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tipoCliente=" + tipoCliente
				+ ", clave=" + clave + "]";
	}

	
	

}
