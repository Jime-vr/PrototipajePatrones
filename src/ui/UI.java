package ui;

import java.io.*;
import java.util.ArrayList;
import gestores.*;
import objetos.*;

public class UI {

	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;

	public static void main(String[] args) throws Exception {
		// iniciarSesion();
		// registrarTramite();
		// registrarUsuario();
		// realizarTramite();

		boolean noSalir = false;
		int opcion = 0;
		do {

			mostrarMenu();
			opcion = leerOpcion(opcion);
			noSalir = ejecutarAccion(opcion);

		} while (noSalir);

	}

	public static void mostrarMenu() throws IOException {
		out.println();
		out.println();
		out.println("---- Bienvenido ----");
		out.println();
		out.println("1.  Registrar usuario.");
		out.println("2.  Registrar tramite");
		out.println("3.  Realizar tramite");
		out.println("4.  Registrar estudiante");
		out.println("5.  Listar empleados");
		out.println("6.  Listar estudiantes");
		out.println("7.  Listar tramites");
		out.println("8.  Salir.");
		out.println();
		out.println();
	}

	static int leerOpcion(int popcion) throws IOException {
		out.println("Digite su opcion:");

		popcion = Integer.parseInt(read.readLine());

		out.println();

		return popcion;
	}

	public static boolean ejecutarAccion(int opc) throws IOException, Exception, Exception {

		boolean noSalir = true;

		switch (opc) {

		case 1: // Registrar usuario

			registrarUsuario();
			break;

		case 2: // Registrar tramite

			registrarTramite();

			break;

		case 3: // Realizar tramite

			realizarTramite();

			break;

		case 4: // Registrar estudiante

			registrarEstudiante();

			break;

		case 5: // Listar empleados

			listarEmpleados();

			break;

		case 6: // Listar estudiantes

			listarEstudiantes();

			break;

		case 7: // Listar tramites

			listarTramites();

			break;
		case 8: // Salir

			out.println("Gracias por usar el sistema.");
			noSalir = false;
			break;

		default: // Cualquier otro valor

			out.println("Opcion invalida.");
			out.println();
			break;

		}
		return noSalir;
	}

	public static void iniciarSesion() throws Exception {
		String id = null;
		String clave = null;

		out.println("Digite su cedula:");
		id = read.readLine();
		out.println("Digite su clave:");
		clave = read.readLine();

		id = id.trim();
		clave = clave.trim();

		GUsuario gestor = new GUsuario();
		ArrayList<Usuario> lista = gestor.getUsuariosRegistrados();

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId().contains(id) && lista.get(i).getClave().contains(clave)) {
				boolean noSalir = false;
				int opcion = 0;
				do {

					mostrarMenu();
					opcion = leerOpcion(opcion);
					noSalir = ejecutarAccion(opcion);

				} while (noSalir);

			}
		}
	}

	public static void registrarUsuario() throws IOException {
		String id;
		String nombre;
		String apellidos;
		String grupo;
		String clave;

		out.println("Digite el numero de cedula:");
		id = read.readLine();
		out.println("Digite el nombre:");
		nombre = read.readLine();
		out.println("Digite los apellidos:");
		apellidos = read.readLine();
		out.println("Digite el grupo al que pertenece:");
		grupo = read.readLine();
		out.println("Digite la clave del usuario:");
		clave = read.readLine();

		GUsuario gestor = new GUsuario();
		gestor.registrarUsuario(id, nombre, apellidos, grupo, clave);

	}

	public static void registrarTramite() throws IOException {
		String numero;
		String nombre;
		String tipo;
		String estado;

		out.println("Digite el numero de tramite:");
		numero = read.readLine();
		out.println("Digite el nombre del tramite:");
		nombre = read.readLine();
		out.println("Digite el tipo de tramite:");
		tipo = read.readLine();

		estado = "Inicializado";

		GTramite gestor = new GTramite();
		gestor.nuevoTramite(numero, nombre, tipo, estado);

	}

	public static void realizarTramite() throws IOException {
		// Tramite/Proceso > Pasos/Tarea > Finalizacion

		String tramite;

		out.println("");
		out.println(" --- TRAMITES --- ");
		out.println(" 1. Solicitar constancia");
		out.println(" 2. Solicitar carta");
		out.println("");
		out.println(" Digite el tipo de tramite que desea realizar:");
		tramite = read.readLine();

		tiposTramites(tramite);

	}

	public static void registrarEstudiante() throws IOException {
		String id;
		String nombre;
		String apellidos;
		String tipoEstudiante;
		String clave;

		out.println("Digite el numero de cedula:");
		id = read.readLine();
		out.println("Digite el nombre:");
		nombre = read.readLine();
		out.println("Digite los apellidos del estudiante:");
		apellidos = read.readLine();
		out.println("Digite el tipo de estudiante:");
		tipoEstudiante = read.readLine();
		out.println("Digite la clave del estudiante:");
		clave = read.readLine();

		GEstudiante gestor = new GEstudiante();
		gestor.registrarEstudiante(id, nombre, apellidos, tipoEstudiante, clave);

	}

	public static void listarEmpleados() throws IOException {
		GUsuario gestor = new GUsuario();

		ArrayList<Usuario> lista = gestor.getUsuariosRegistrados();

		String id;
		String nombre;
		String apellidos;
		String tipoEmpleado;
		String puesto = null;

		for (int i = 0; i < lista.size(); i++) {
			id = lista.get(i).getId();
			nombre = lista.get(i).getNombre();
			apellidos = lista.get(i).getApellidos();
			tipoEmpleado = lista.get(i).getGrupo();

			if (tipoEmpleado.contains("1")) {
				puesto = "Secretario/a";
			} else if (tipoEmpleado.contains("2")) {
				puesto = "Contador/a";
			} else if (tipoEmpleado.contains("3")) {
				puesto = "Asesor/a";
			} else if (tipoEmpleado.contains("4")) {
				puesto = "Jefe/a";
			} else if (tipoEmpleado.contains("5")) {
				puesto = "Admisor/a";
			} else if (tipoEmpleado.contains("6")) {
				puesto = "Registro";
			} else if (tipoEmpleado.contains("7")) {
				puesto = "Administrador/a";
			}

			out.println("Cedula: " + id + " | Nombre : " + nombre + " " + apellidos + " | Puesto:  " + puesto + " |");

		}
	}

	public static void listarEstudiantes() throws IOException {
		GEstudiante gestor = new GEstudiante();

		ArrayList<Estudiante> lista = gestor.getEstudiantesRegistrados();

		String id;
		String nombre;
		String apellidos;
		String tipoEstudiante;

		for (int i = 0; i < lista.size(); i++) {
			id = lista.get(i).getId();
			nombre = lista.get(i).getNombre();
			apellidos = lista.get(i).getApellidos();
			tipoEstudiante = lista.get(i).getTipoEstudiante();

			out.println("Cedula: " + id + " | Nombre : " + nombre + " " + apellidos + " | Tipo estudiante: + "
					+ tipoEstudiante + " |");

		}
	}

	public static void listarTramites() throws IOException {

		GTramite gestor = new GTramite();

		ArrayList<Tramite> lista = gestor.getTramitesRegistrados();

		String numero;
		String nombre;
		String tipo;
		String estado;

		for (int i = 0; i < lista.size(); i++) {
			numero = lista.get(i).getNumero();
			nombre = lista.get(i).getNombre();
			tipo = lista.get(i).getTipo();
			estado = lista.get(i).getEstado();

			out.println("Numero tramite: " + numero + " | Nombre tramite: " + nombre + " | Tipo tramite: " + tipo
					+ "Estado tramite: " + estado + "|");
		}

	}

	public static void tiposTramites(String tramite) throws IOException {

		String carta;

		switch (tramite) {
		case "1":
			constancia();
			break;
		case "2":
			out.println("");
			out.println("--- CARTAS ---");
			out.println(" 1. Estudiante activo");
			out.println(" 2. Conape");
			out.println(" 3. Volver");
			out.println("Digite la opcion que desea:");
			carta = read.readLine();

			if (carta.equals("1")) {
				estudianteActivo();
			} else if (carta.equals("2")) {
				conape();
			} else if (carta.equals("3")) {
				mostrarMenu();
			}

		}
	}

	public static void constancia() throws IOException {
		out.println("");
		out.println("Usted ha solicitado una constancia... Espere un momento y se iniciara el tramite.");
	}

	public static void estudianteActivo() throws IOException {
		out.println("");
		out.println("Usted ha solicitado una carta de estudiante activo... Espere un momento y se iniciara el tramite.");
	}

	public static void conape() throws IOException {
		out.println("");
		out.println("Usted ha solicitado una carta de Conape... Espere un momento y se iniciara el tramite.");
	}
}
