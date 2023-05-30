package concesionario.model;

import java.util.ArrayList;
import concesionario.model.Vehiculo;
import concesionario.exceptions.ClienteException;
import concesionario.exceptions.EmpleadoException;
import concesionario.exceptions.VehiculoException;

public class Empleado {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasenia;
	private String correoElectronico;
	private String idEmpleado;
	private String respuestaSeguridad;
	private boolean cuentaBloqueada;
	private ArrayList<Vehiculo> listaVehiculos;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Transaccion> listaTransacciones;

	public Empleado(String nombre, String apellido, String idEmpleado, String usuario, String contrasenia,
			String correoElectronico, String respuestaSeguridad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEmpleado = idEmpleado;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.correoElectronico = correoElectronico;
		this.respuestaSeguridad = respuestaSeguridad;
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.listaClientes = new ArrayList<Cliente>();
		this.listaTransacciones = new ArrayList<Transaccion>();
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getRespuestaSeguridad() {
		return respuestaSeguridad;
	}

	public void setRespuestaSeguridad(String respuestaSeguridad) {
		this.respuestaSeguridad = respuestaSeguridad;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public boolean isCuentaBloqueada() {
		return cuentaBloqueada;
	}

	public void setCuentaBloqueada(boolean cuentaBloqueada) {
		this.cuentaBloqueada = cuentaBloqueada;
	}

	public void registrarVehiculo(Vehiculo vehiculo) {
		listaVehiculos.add(vehiculo);
	}

	public void registrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	// ALQUILAR VEHICULO
	public void alquilarVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (listaVehiculos.contains(vehiculo)) {
			vehiculo.alquilar(cliente);
		} else {
			System.out.println("El veh�culo no se encuentra en el inventario");
		}
	}

	// VENDER VEHICULO
	public void venderVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (listaVehiculos.contains(vehiculo)) {
			vehiculo.vender(cliente);
			listaVehiculos.remove(vehiculo);
		} else {
			System.out.println("El veh�culo no se encuentra en el inventario");
		}
	}

	// COMPRAR VEHICULO
	public void comprarVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (vehiculo.revisionTecnicaAprobada()) {
			listaVehiculos.add(vehiculo);
		} else {
			System.out.println("El veh�culo no ha pasado la revisi�n t�cnica");
		}
	}

	// REGISTRAR TRANSACCION
	public void registrarTransaccion(Transaccion transaccion) {
		listaTransacciones.add(transaccion);
		// System.out.println("Empleado " + nombre + " realiz� una " +
		// TipoTransaccion + " del veh�culo " + vehiculo.getModelo() + " al
		// cliente " + cliente.getNombre());
	}

	// CRUD VEHICULO
	public String registroVehiculo(String marca, boolean esNuevo, String modelo, int cambios,
			TipoTransmision tipoTransmision, TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
			boolean aireAcondicionado, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros,
			boolean abs, String numeroChasis) throws EmpleadoException {
		String mensaje = "El vehiculo ha sido registrado";
		String accion = mensaje + " Y sera para la venta";
		Vehiculo nuevoVehiculo = new Vehiculo(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible,
				velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs,
				numeroChasis);
		listaVehiculos.add(nuevoVehiculo);
		if (esNuevo == false) {
			accion = mensaje + " Y sera para alquilar";
		}
		return accion;
	}

	public Vehiculo obtenerVehiculo(String numeroChasis) {
		Vehiculo vehiculoEncontrado = null;
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getNumeroChasis().equals(numeroChasis)) {
				vehiculoEncontrado = vehiculo;
			}
		}
		return vehiculoEncontrado;
	}

	public void eliminarVehiculo(String numeroChasis) throws VehiculoException {
		Vehiculo vehiculoEncontrado = obtenerVehiculo(numeroChasis);
		if (vehiculoEncontrado == null) {
			throw new VehiculoException("El Vehiculo no esta registrado");
		}
		listaVehiculos.remove(vehiculoEncontrado);
	}

	public String actualizarVehiculo(String marca, boolean esNuevo, String modelo, int cambios,
			TipoTransmision tipoTransmision, TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
			boolean aireAcondicionado, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros,
			boolean abs, String numeroChasis) throws VehiculoException {
		Vehiculo vehiculoEncontrado = obtenerVehiculo(numeroChasis);
		if (vehiculoEncontrado == null) {
			throw new VehiculoException("El vehiculo no se encuentra registrado");
		}
		vehiculoEncontrado.setNumeroChasis(marca);
		vehiculoEncontrado.setEsNuevo(esNuevo);
		vehiculoEncontrado.setModelo(modelo);
		vehiculoEncontrado.setCambios(cambios);
		vehiculoEncontrado.setTipoTransmision(tipoTransmision);
		vehiculoEncontrado.setTipoCombustible(tipoCombustible);
		vehiculoEncontrado.setVelocidadMaxima(velocidadMaxima);
		vehiculoEncontrado.setCilindraje(cilindraje);
		vehiculoEncontrado.setAireAcondicionado(aireAcondicionado);
		vehiculoEncontrado.setnPuertas(nPuertas);
		vehiculoEncontrado.setCamaraReversa(camaraReversa);
		vehiculoEncontrado.setnBolsasDeAire(nBolsasDeAire);
		vehiculoEncontrado.setnPasajeros(nPasajeros);
		vehiculoEncontrado.setAbs(abs);
		vehiculoEncontrado.setNumeroChasis(numeroChasis);
		return "El vehiculo ha sido actualizado";
	}

	// CRUD CLIENTE
	public String registrarClientes(String nombre, String apellido, String usuario, String contrasenia,
			String correoElectronico, String identificacion) throws EmpleadoException {

		String mensaje = "El cliente ha sido registrado";
		boolean ClienteEncontrado = verificarCliente(identificacion);
		if (ClienteEncontrado == true) {
			throw new EmpleadoException("El cliente ya existe");
		} else {
			Cliente nuevoCliente = new Cliente(nombre, apellido, usuario, contrasenia, correoElectronico,
					identificacion);
			listaClientes.add(nuevoCliente);
		}
		return mensaje;
	}

	private boolean verificarCliente(String identificacion) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getUsuario().equals(identificacion)) {
				return true;
			}
		}
		return false;
	}

	public void eliminarCliente(String identificacion) throws ClienteException {
		Cliente clienteEncontrado = buscarCliente(identificacion);
		if (clienteEncontrado == null) {
			throw new ClienteException("El cliente no esta registrado");
		}
		listaClientes.remove(clienteEncontrado);
	}

	public Cliente buscarCliente(String identificacion) {
		Cliente clienteteEncontrado = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getUsuario().equals(identificacion)) {
				clienteteEncontrado = cliente;
			}
		}
		return clienteteEncontrado;
	}

	public String actualizarCliente(String nombre, String apellido, String usuario, String contrasenia,
			String correoElectronico, String identificacion) throws Exception {
		Cliente clienteEncontrado = buscarCliente(identificacion);
		if (clienteEncontrado == null) {
			throw new EmpleadoException("El cliente no esta registrado");
		}
		clienteEncontrado.setNombre(nombre);
		clienteEncontrado.setApellido(apellido);
		clienteEncontrado.setUsuario(usuario);
		clienteEncontrado.setContrasena(contrasenia);
		clienteEncontrado.setCorreoElectronico(correoElectronico);
		clienteEncontrado.setIdentificacion(identificacion);

		return " El cliente ha sido actualizado ";
	}


	public void setBloqueado(boolean b) {
		// TODO Auto-generated method stub

	}

}
