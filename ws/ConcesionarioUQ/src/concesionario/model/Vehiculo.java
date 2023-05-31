package concesionario.model;

import java.util.Optional;

public class Vehiculo {
	/**
	 * atributos
	 */
	protected String marca;
	protected boolean esNuevo;
	protected String modelo;
	protected int cambios;
	protected TipoTransmision tipoTransmision;
	protected TipoCombustible tipoCombustible;
	protected int velocidadMaxima;
	protected float cilindraje;
	protected boolean aireAcondicionado;
	protected int nPuertas;
	protected boolean camaraReversa;
	protected int nBolsasDeAire;
	protected int nPasajeros;
	protected boolean abs;
	protected String numeroChasis;
	private Cliente clienteAsignado;
/**constructor
 *
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
 */
	public Vehiculo(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
			int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
		this.marca = marca;
		this.esNuevo = esNuevo;
		this.modelo = modelo;
		this.cambios = cambios;
		this.tipoTransmision = tipoTransmision;
		this.tipoCombustible = tipoCombustible;
		this.velocidadMaxima = velocidadMaxima;
		this.cilindraje = cilindraje;
		this.aireAcondicionado = aireAcondicionado;
		this.nPuertas = nPuertas;
		this.camaraReversa = camaraReversa;
		this.nBolsasDeAire = nBolsasDeAire;
		this.nPasajeros = nPasajeros;
		this.abs = abs;
		this.numeroChasis = numeroChasis;
	}

/**
 * getters y setters
 * @return
 */
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEsNuevo() {
		return esNuevo;
	}

	public void setEsNuevo(boolean esNuevo) {
		this.esNuevo = esNuevo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public TipoTransmision getTipoTransmision() {
		return tipoTransmision;
	}

	public void setTipoTransmision(TipoTransmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public float getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(float cilindraje) {
		this.cilindraje = cilindraje;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public boolean isCamaraReversa() {
		return camaraReversa;
	}

	public void setCamaraReversa(boolean camaraReversa) {
		this.camaraReversa = camaraReversa;
	}

	public int getnBolsasDeAire() {
		return nBolsasDeAire;
	}

	public void setnBolsasDeAire(int nBolsasDeAire) {
		this.nBolsasDeAire = nBolsasDeAire;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public String getNumeroChasis() {
		return numeroChasis;
	}

	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	public boolean revisionTecnicaAprobada() {
	    return true;
	}

	public void vender(Cliente cliente) {
		if (clienteAsignado != null) {
		    realizarVenta(clienteAsignado);
		} else {
		    System.out.println("No se puede realizar la venta, no hay cliente asignado.");
		}

	}

	private void realizarVenta(Cliente cliente) {
	    if (!revisionTecnicaAprobada()) {
	        System.out.println("El veh�culo no puede ser vendido, no ha aprobado la revisi�n t�cnica.");
	        return;
	    }

	    System.out.println("Realizando venta del veh�culo " + this.getMarca() + " " + this.getModelo());

	    asignarCliente(cliente);

	    double precioVenta = calcularPrecioVenta();

	    registrarVenta(cliente, precioVenta);

	    this.setEsNuevo(false);

	    System.out.println("El veh�culo " + this.getMarca() + " " + this.getModelo() + " ha sido vendido a " + cliente.getNombre() + " por un precio de $" + precioVenta);
	}

	private double calcularPrecioVenta() {
	    double precioBase = 10000.0;
	    double factorDescuento = 0.9;
	    return precioBase * factorDescuento;
	}

	private void registrarVenta(Cliente cliente, double precioVenta) {
	    System.out.println("Registrando la venta del veh�culo " + this.getMarca() + " " + this.getModelo() + " al cliente " + cliente.getNombre() + " por un precio de $" + precioVenta);
	    cliente.agregarVenta(this, precioVenta);
	}

	private void asignarCliente(Cliente cliente) {
	    this.clienteAsignado = cliente;
	}

	public void alquilar(Cliente cliente) {
	    System.out.println("El veh�culo " + this.getMarca() + " " + this.getModelo() + " ha sido alquilado por " + cliente.getNombre());
	    asignarCliente(cliente);
	}

	public void comprar(Cliente cliente) {
	    if (!revisionTecnicaAprobada()) {
	        System.out.println("El veh�culo no puede ser comprado, no ha aprobado la revisi�n t�cnica.");
	        return;
	    }

	    System.out.println("Realizando compra del veh�culo " + this.getMarca() + " " + this.getModelo() + " por parte de " + cliente.getNombre());

	    asignarCliente(cliente);

	    double precioVenta = calcularPrecioVenta();

	    registrarVenta(cliente, precioVenta);

	    this.setEsNuevo(false);

	    System.out.println("El veh�culo " + this.getMarca() + " " + this.getModelo() + " ha sido comprado por " + cliente.getNombre() + " por un precio de $" + precioVenta);
	}

}