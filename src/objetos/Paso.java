package objetos;

public class Paso {
	
	private String numPaso;
	private Tramite numTramite;	
	private String paso;

	public Paso() {
	}

	public Paso(String numPaso, Tramite numTramite, String paso) {
		this.numPaso = numPaso;
		this.numTramite = numTramite;
		this.paso = paso;
	}

	public String getNumPaso() {
		return numPaso;
	}

	public void setNumPaso(String numPaso) {
		this.numPaso = numPaso;
	}

	public Tramite getNumTramite() {
		return numTramite;
	}

	public void setNumTramite(Tramite numTramite) {
		this.numTramite = numTramite;
	}

	public String getPaso() {
		return paso;
	}

	public void setPaso(String paso) {
		this.paso = paso;
	}

	@Override
	public String toString() {
		return "Paso [numPaso=" + numPaso + ", numTramite=" + numTramite + ", paso=" + paso + "]";
	}
	
	
	
	
}
