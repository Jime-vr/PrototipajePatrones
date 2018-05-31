package objetos;

public class Tramite {
	
	private String numero;
	private String nombre;
	private String tipo;
	private String estado;
	
	public Tramite() {
		
	}
	
	public Tramite(String numero, String nombre, String tipo, String estado) {
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Tramite [numero=" + numero + ", nombre=" + nombre + ", descripcion=" + tipo + ", estado="
				+ estado +  "]";
	}
	
	

}
