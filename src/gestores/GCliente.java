package gestores;

import java.util.ArrayList;

import objetos.Cliente;

public class GCliente {

	private ArrayList<Cliente> clientesRegistrados = new ArrayList<Cliente>();
	
	public GCliente() {
		
	}

	public GCliente(ArrayList<Cliente> clientesRegistrados) {
		this.clientesRegistrados = clientesRegistrados;
	}

	public ArrayList<Cliente> getClientesRegistradoss() {
		return clientesRegistrados;
	}

	public void setClientesRegistradoss(ArrayList<Cliente> clientesRegistrados) {
		this.clientesRegistrados = clientesRegistrados;
	}
	
	public boolean registrarCliente(String id, String nombre, String apellidos, String tipoCliente, String clave) {
		boolean existe = false;

		for (int i = 0; i < clientesRegistrados.size(); i++) {
			if (clientesRegistrados.get(i).getId().contains(id)) {
				existe = true;
			}
		}

		if (existe == false) {
			Cliente tmpCliente = new Cliente(id, nombre, apellidos, tipoCliente, clave);
			clientesRegistrados.add(tmpCliente);
		}

		return existe;
	}

}
