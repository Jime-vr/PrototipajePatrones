package gestores;

import java.util.ArrayList;

import objetos.Usuario;

public class GUsuario {

	private static ArrayList<Usuario> usuariosRegistrados = new ArrayList<Usuario>();

	/*
	 * Tipos de usuarios: 1. Secretariado 2. Contabilidad 3. Asesoramiento 4.
	 * Jefatura 5. Admision 6. Registro 7. Administrador
	 */

	public GUsuario() {

	}

	public GUsuario(ArrayList<Usuario> usuariosRegistrados) {
		GUsuario.usuariosRegistrados = usuariosRegistrados;
	}

	public ArrayList<Usuario> getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosRegistrados(ArrayList<Usuario> usuariosRegistrados) {
		GUsuario.usuariosRegistrados = usuariosRegistrados;
	}

	public boolean registrarUsuario(String id, String nombre, String apellidos, String grupo, String clave) {
		boolean existe = false;

		for (int i = 0; i < usuariosRegistrados.size(); i++) {
			if (usuariosRegistrados.get(i).getId().contains(id)) {
				existe = true;
			}
		}

		if (existe == false) {
			Usuario tmpUsuario = new Usuario(id, nombre, apellidos, grupo, clave);
			usuariosRegistrados.add(tmpUsuario);
		}

		return existe;
	}
}
