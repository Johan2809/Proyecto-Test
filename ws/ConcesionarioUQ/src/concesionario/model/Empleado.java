package concesionario.model;

import concesionario.exceptions.ClienteException;
import concesionario.exceptions.EmpleadoException;
import concesionario.exceptions.VehiculoException;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	/**
	 * atributos
	 */
    private String nombre;
    private String apellido;
    private String idEmpleado;
    private String usuario;
    private String contrasenia;
    private String correoElectronico;
    private String respuestaSeguridad;
    private boolean cuentaBloqueada;
    private ArrayList<Vehiculo> listaVehiculos;
    private List<Cliente>listaClientes;
    private ArrayList<Transaccion> listaTransacciones;

    public Empleado() {
        this.listaClientes = new ArrayList<>();
    }


/**
 * constructor
 * @param nombre
 * @param apellido
 * @param idEmpleado
 * @param usuario
 * @param contrasenia
 * @param correoElectronico
 * @param respuestaSeguridad
 * @param listaClientes
 */
	public Empleado(String nombre, String apellido, String idEmpleado, String usuario, String contrasenia,
			String correoElectronico, String respuestaSeguridad, List<Cliente> listaClientes) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEmpleado = idEmpleado;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.correoElectronico = correoElectronico;
		this.respuestaSeguridad = respuestaSeguridad;
		this.listaClientes = listaClientes;
	}

/**
 * geters y setters
 * @return
 */
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

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
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

	public String getRespuestaSeguridad() {
		return respuestaSeguridad;
	}

	public void setRespuestaSeguridad(String respuestaSeguridad) {
		this.respuestaSeguridad = respuestaSeguridad;
	}

	public boolean isCuentaBloqueada() {
		return cuentaBloqueada;
	}

	public void setCuentaBloqueada(boolean cuentaBloqueada) {
		this.cuentaBloqueada = cuentaBloqueada;
	}

	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}

	public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
		this.listaTransacciones = listaTransacciones;
	}

	public void registrarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }
	public void registrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	/**
	 * metodo que registra cliente
	 * @param nombre
	 * @param apellido
	 * @param idCliente
	 * @param usuario
	 * @param contrasenia
	 * @param correoElectronico
	 * @return
	 * @throws ClienteException
	 */
    public Cliente registrarCliente(String nombre, String apellido,String idCliente, String usuario, String contrasenia, String correoElectronico) throws ClienteException {
        Cliente clienteAux = new Cliente(nombre,apellido,idCliente,usuario,contrasenia,correoElectronico);
        listaClientes.add(clienteAux);
        return clienteAux;
    }

	/**
	 * metodo para ALQUILAR VEHICUL
	 * @param vehiculo
	 * @param cliente
	 */
	public void alquilarVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (listaVehiculos.contains(vehiculo)) {
			vehiculo.alquilar(cliente);
		} else {
			System.out.println("El vehículo no se encuentra en el inventario");
		}
	}

	/**
	 * metodo para vender vehiculo
	 * @param vehiculo
	 * @param cliente
	 */
	public void venderVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (listaVehiculos.contains(vehiculo)) {
			vehiculo.vender(cliente);
			listaVehiculos.remove(vehiculo);
		} else {
			System.out.println("El vehículo no se encuentra en el inventario");
		}
	}

	/**
	 * metodo para comprar vehiculo
	 * @param vehiculo
	 * @param cliente
	 */
	public void comprarVehiculo(Vehiculo vehiculo, Cliente cliente) {
		if (vehiculo.revisionTecnicaAprobada()) {
			listaVehiculos.add(vehiculo);
		} else {
			System.out.println("El vehículo no ha pasado la revisión técnica");
		}
	}

	/**
	 * metodo para registrar transaccion
	 * @param transaccion
	 */
	public void registrarTransaccion(Transaccion transaccion) {
		listaTransacciones.add(transaccion);
		// System.out.println("Empleado " + nombre + " realizó una " +
		// TipoTransaccion + " del vehículo " + vehiculo.getModelo() + " al
		// cliente " + cliente.getNombre());
	}

	/**
	 * metodo que registra vehiculo
	 * @param marca
	 * @param esNuevo
	 * @param modelo
	 * @param cambios
	 * @param tipoTransmision
	 * @param tipoCombustible
	 * @param velocidadMaxima
	 * @param cilindraje
	 * @param aireAcondicionado
	 * @param nPuertas
	 * @param camaraReversa
	 * @param nBolsasDeAire
	 * @param nPasajeros
	 * @param abs
	 * @param numeroChasis
	 * @return
	 * @throws EmpleadoException
	 */
	public Vehiculo registroVehiculo(String marca, boolean esNuevo, String modelo, int cambios,
			TipoTransmision tipoTransmision, TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
			boolean aireAcondicionado, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros,
			boolean abs, String numeroChasis) throws EmpleadoException {
		Vehiculo nuevoVehiculo = new Vehiculo(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible,
				velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs,
				numeroChasis);
		listaVehiculos.add(nuevoVehiculo);
		return nuevoVehiculo;
		}

/**
 * metodo que obtiene el vehiculo
 * @param numeroChasis
 * @return
 */
	public Vehiculo obtenerVehiculo(String numeroChasis) {
		Vehiculo vehiculoEncontrado = null;
		for (Vehiculo vehiculo : listaVehiculos) {
			if (vehiculo.getNumeroChasis().equals(numeroChasis)) {
				vehiculoEncontrado = vehiculo;
			}
		}
		return vehiculoEncontrado;
	}
/**
 * metodo eliminar vehiculo
 * @param numeroChasis
 * @throws VehiculoException
 */
	public void eliminarVehiculo(String numeroChasis) throws VehiculoException {
		Vehiculo vehiculoEncontrado = obtenerVehiculo(numeroChasis);
		if (vehiculoEncontrado == null) {
			throw new VehiculoException("El Vehiculo no esta registrado");
		}
		listaVehiculos.remove(vehiculoEncontrado);
	}
/**
 * metodo actualizar vehiculo
 * @param marca
 * @param esNuevo
 * @param modelo
 * @param cambios
 * @param tipoTransmision
 * @param tipoCombustible
 * @param velocidadMaxima
 * @param cilindraje
 * @param aireAcondicionado
 * @param nPuertas
 * @param camaraReversa
 * @param nBolsasDeAire
 * @param nPasajeros
 * @param abs
 * @param numeroChasis
 * @return
 * @throws VehiculoException
 */
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

	/**
	 * metodo para registrar clientes
	 * @param nombre
	 * @param apellido
	 * @param usuario
	 * @param contrasenia
	 * @param correoElectronico
	 * @param identificacion
	 * @return
	 * @throws EmpleadoException
	 */
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
/**
 * metodo para verificar cliente
 * @param idCliente
 * @return
 */
	private boolean verificarCliente(String idCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				return true;
			}
		}
		return false;
	}
/**
 * metodo para eliminar cliente
 * @param identificacion
 * @throws ClienteException
 */
	public void eliminarCliente(String identificacion) throws ClienteException {
		Cliente clienteEncontrado = buscarCliente(identificacion);
		if (clienteEncontrado == null) {
			throw new ClienteException("El cliente no esta registrado");
		}
		listaClientes.remove(clienteEncontrado);
	}
/**
 * metodo para buscar cliente
 * @param idCliente
 * @return
 */
	public Cliente buscarCliente(String idCliente) {
		Cliente clienteteEncontrado = null;
		for (Cliente cliente : listaClientes) {
			if (cliente.getIdCliente().equals(idCliente)) {
				clienteteEncontrado = cliente;
			}
		}
		return clienteteEncontrado;
	}
/**
 * metodo para actualizar cliente
 * @param nombre
 * @param apellido
 * @param idCliente
 * @param usuario
 * @param contrasenia
 * @param correoElectronico
 * @throws ClienteException
 */
    public void actualizarCliente(String nombre, String apellido, String idCliente, String usuario,
            String contrasenia, String correoElectronico) throws ClienteException {
        Cliente clienteEncontrado = buscarCliente(idCliente);
        clienteEncontrado.setNombre(nombre);
        clienteEncontrado.setApellido(apellido);
        clienteEncontrado.setUsuario(usuario);
        clienteEncontrado.setContrasenia(contrasenia);
        clienteEncontrado.setCorreoElectronico(correoElectronico);

    }


public void setBloqueado(boolean b) {


}


}
