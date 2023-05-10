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
/*
 * Metodo para ver los reportes de los negocios realizados por cada uno de los empleado en un periodo de tiempo dado
 */
	public void verReportes(String fechaInicio, String fechaFin) {

	}


//	public void recuperarContrasena(String usuario, String respuesta) throws EmpleadoException {
//		// Buscamos al empleado en la lista de empleados
//		Empleado empleado = buscarEmpleadoPorUsuario(usuario);
//		if (empleado == null) {
//			// Si el empleado no est� registrado, lanzamos una excepci�n
//			throw new EmpleadoException("El empleado no est� registrado");
//		}
//		// Verificamos que la respuesta a la pregunta de seguridad sea correcta
//		if (!empleado.getRespuestaSeguridad().equals(respuesta)) {
//			// Si la respuesta es incorrecta, lanzamos una excepci�n
//			throw new EmpleadoException("La respuesta a la pregunta de seguridad es incorrecta");
//		}
//	}
//
//	public void recuperarContrasenaPorEmail(String correoElectronico) throws EmpleadoException {
//		Empleado empleadoEncontrado = buscarEmpleadoPorEmail(correoElectronico);
//		if (empleadoEncontrado == null) {
//			throw new EmpleadoException("No existe un empleado con este correo electr�nico");
//		}
//
//	}
//
//	private Empleado buscarEmpleadoPorEmail(String correoElectronico) {
//
//		return null;
//	}
//
//	// public void enviarCorreo(String destinatario, String asunto, String
//	// cuerpo) throws EmpleadoException {
//	// Properties propiedades = new Properties();
//	// propiedades.put("mail.smtp.host", "smtp.gmail.com");
//	// propiedades.put("mail.smtp.port", "587");
//	// propiedades.put("mail.smtp.auth", "true");
//	// propiedades.put("mail.smtp.starttls.enable", "true");
//	//
//	// Session session = Session.getInstance(propiedades, new
//	// javax.mail.Authenticator() {
//	// protected PasswordAuthentication getPasswordAuthentication() {
//	// return new PasswordAuthentication("correo@gmail.com", "contrase�a");
//	// }
//	// });
//	//
//	// Message mensaje = new MimeMessage(session);
//	// mensaje.setFrom(new InternetAddress("correo@gmail.com"));
//	// mensaje.setRecipients(Message.RecipientType.TO,
//	// InternetAddress.parse(destinatario));
//	// mensaje.setSubject(asunto);
//	// mensaje.setText(cuerpo);
//	//
//	// Transport.send(mensaje);
//	// }
//
//	private Empleado buscarEmpleadoPorUsuario(String usuario) {
//		for (Empleado empleado : listaEmpleados) {
//			if (empleado.getUsuario().equals(usuario)) {
//				return empleado;
//			}
//		}
//		return null;
//	}

	public String registrarEmpleado(String nombre, String apellido, String usuario, String contrasenia, String idEmpleado,
            String correoElectronico, String respuestaSeguridad, String contrasenaAdministrador) throws AdministradorException {
		// Verificar identidad del administrador
		if (!this.contrasena.equals(contrasenaAdministrador)) {
			throw new AdministradorException("Contrase�a del Administrador incorrecta");
		}

		String mensaje = "El empleado ha sido registrado";
		boolean empleadoEncontrado = verificarEmpleado(idEmpleado);
		if (empleadoEncontrado == true) {
			throw new AdministradorException("El empleado ya existe");
		} else {
			Empleado nuevoEmpleado = new Empleado(nombre, apellido, usuario, contrasenia, idEmpleado, correoElectronico, respuestaSeguridad);
			listaEmpleados.add(nuevoEmpleado);
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

	public String actualizarEmpleado(String nombre, String apellido, String usuario, String contrasena,String idEmpleado,
			String correoElectronico) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}

		empleadoEncontrado.setNombre(nombre);
		empleadoEncontrado.setApellido(apellido);
		empleadoEncontrado.setUsuario(usuario);
		empleadoEncontrado.setContrasenia(contrasena);
		empleadoEncontrado.setIdEmpleado(idEmpleado);
		empleadoEncontrado.setCorreoElectronico(correoElectronico);

		return "El empleado ha sido actualizado";
	}

	public String eliminarEmpleado(String idEmpleado) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}

		listaEmpleados.remove(empleadoEncontrado);

		return "El empleado ha sido eliminado";
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

	public void bloquearCuentaEmpleado(String idEmpleado) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}
		empleadoEncontrado.setCuentaBloqueada(true);
	}

	public void desbloquearCuentaEmpleado(String idEmpleado) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}
		empleadoEncontrado.setCuentaBloqueada(false);
	}

	public String generarCredenciales(String nombreEmpleado, String idEmpleado) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}

		String credenciales = "Usuario: " + empleadoEncontrado.getUsuario() + ", Contrase�a: "
				+ empleadoEncontrado.getContrasenia();
		return credenciales;
	}

	public void cambiarContrasenaEmpleado(String idEmpleado, String nuevaContrasena) throws EmpleadoException {
		Empleado empleadoEncontrado = buscarEmpleado(idEmpleado);
		if (empleadoEncontrado == null) {
			throw new EmpleadoException("El empleado no est� registrado");
		}
		empleadoEncontrado.setContrasenia(nuevaContrasena);
	}

}
