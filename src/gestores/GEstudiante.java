package gestores;

import java.util.ArrayList;

import objetos.Estudiante;

public class GEstudiante {

	private ArrayList<Estudiante> estudiantesRegistrados = new ArrayList<Estudiante>();
	
	public GEstudiante() {
		
	}

	public GEstudiante(ArrayList<Estudiante> estudiantesRegistrados) {
		this.estudiantesRegistrados = estudiantesRegistrados;
	}

	public ArrayList<Estudiante> getEstudiantesRegistrados() {
		return estudiantesRegistrados;
	}

	public void setEstudiantesRegistrados(ArrayList<Estudiante> estudiantesRegistrados) {
		this.estudiantesRegistrados = estudiantesRegistrados;
	}
	
	public boolean registrarEstudiante(String id, String nombre, String apellidos, String tipoEstudiante, String clave) {
		boolean existe = false;

		for (int i = 0; i < estudiantesRegistrados.size(); i++) {
			if (estudiantesRegistrados.get(i).getId().contains(id)) {
				existe = true;
			}
		}

		if (existe == false) {
			Estudiante tmpEstudiante = new Estudiante(id, nombre, apellidos, tipoEstudiante, clave);
			estudiantesRegistrados.add(tmpEstudiante);
		}

		return existe;
	}

}
