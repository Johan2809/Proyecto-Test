package concesionario.model;

public class PickUp extends Vehiculo {
	/**
	 * atributos
	 */
	private boolean es4x4;
	private double capacidadCajaCarga;
	/**
	 * constructor
	 * @param marca
	 * @param esNuevo
	 * @param modelo
	 * @param cambios
	 * @param tipoTransmision
	 * @param tipoCombustible
	 * @param velocidadMaxima
	 * @param cilindraje
	 * @param nPasajeros
	 * @param nPuertas
	 * @param aireAcondicionado
	 * @param camaraReversa
	 * @param nBolsasDeAire
	 * @param abs
	 * @param es4x4
	 * @param capacidadCajaCarga
	 * @param numeroChasis
	 */
	public PickUp(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, int nPasajeros, int nPuertas, boolean aireAcondicionado, boolean camaraReversa, int nBolsasDeAire, boolean abs, boolean es4x4, double capacidadCajaCarga, String numeroChasis) {
		super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
		this.es4x4 = es4x4;
		this.capacidadCajaCarga = capacidadCajaCarga;
	}
}

