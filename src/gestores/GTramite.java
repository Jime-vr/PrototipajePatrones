package gestores;

import java.util.ArrayList;

import objetos.Tramite;

public class GTramite {

	private static ArrayList<Tramite> tramitesRegistrados = new ArrayList<Tramite>();
	

	public GTramite() {
		
	}
	public GTramite(ArrayList<Tramite> tramitesRegistrados) {
		GTramite.tramitesRegistrados = tramitesRegistrados;
	}

	public ArrayList<Tramite> getTramitesRegistrados() {
		return tramitesRegistrados;
	}

	public void setTramitesRegistrados(ArrayList<Tramite> tramitesRegistrados) {
		GTramite.tramitesRegistrados = tramitesRegistrados;
	}

	public boolean nuevoTramite(String numero, String nombre, String descripcion, String tipo) {

		boolean existe = false;

		for (int i = 0; i < tramitesRegistrados.size(); i++) {
			if (tramitesRegistrados.get(i).getNumero().contains(numero)) {
				existe = true;
			}
		}

		if (existe == false) {
			Tramite tmpTramite = new Tramite(numero, nombre, descripcion, tipo);
			tramitesRegistrados.add(tmpTramite);
		}

		return existe;
	}

}
