package concesionario.model;

import java.util.ArrayList;

import concesionario.exceptions.AdministradorException;
import concesionario.exceptions.EmpleadoException;

public class Administrador {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private Empleado empleado;
	private ArrayList<Empleado> listaEmpleados;

	public Administrador(String nombre, String apellido, String usuario, String contrasena, Empleado empleado,
			ArrayList<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.empleado = empleado;
		this.listaEmpleados = listaEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public void verReportes() {
		// Codigo para ver reportes de negocios realizados por cada uno de los
		// empleados en un periodo de tiempo dado
	}

	public void recuperarContrasena() {
		// Codigo para recuperar la contrasenia mediante una pregunta de
		// seguridad
	}

	public String registrarEmpleado(String nombre, String id) throws AdministradorException {

		String mensaje = "El empleado ha sido registrado";
		boolean empleadoEncontrado = verificarEmpleado(usuario);
		if (empleadoEncontrado == true) {
			throw new AdministradorException("El empleado ya existe");
		} else {
			Empleado nuevoCliente = new Empleado(nombre, id);
			listaEmpleados.add(nuevoCliente);
		}
		return mensaje;
	}

	private boolean verificarEmpleado(String idEmpleado) {
		boolean verificado = false;
		for (Empleado empleado : listaEmpleados) {

			if (empleado.getIdEmpleado().equals(idEmpleado)) {
				verificado = true;
				return verificado;
			}

		}
		return verificado;

	}

	public String actualizarEmpleado(String nombre, String idEmpleado) throws Exception {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El cliente no esta registrado");
		}

		empleadoEncontrado.setIdEmpleado(idEmpleado);
		empleadoEncontrado.setNombre(nombre);

		return " El cliente ha sido actualizado ";
	}

	public Empleado buscarEmpleado(String idEmpleado) {

		Empleado empleadoEncontrado = null;

		for (Empleado empleado : listaEmpleados) {
			if (empleado.getIdEmpleado().equals(idEmpleado)) {
				empleadoEncontrado = empleado;
			}
		}
		return empleadoEncontrado;
	}
}

/**
 *
 * @param activo
 */
// public void bloquearEmpleado(boolean activo) {
// if (!activo) {
// // Eliminar empleado de la lista de empleados
// listaEmpleados.remove(buscarEmpleado(empleado));
//     }
// }
// }