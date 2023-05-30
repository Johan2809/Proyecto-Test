package concesionario.model;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasenia;
	private String correoElectronico;
	private String identificacion;

	public Cliente(String nombre, String apellido, String usuario, String contrasenia, String correoElectronico,
			String identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.correoElectronico = correoElectronico;
		this.identificacion = identificacion;
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
		return contrasenia;
	}

	public void setContrasena(String contrasena) {
		this.contrasenia = contrasena;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return null;
	}

}
