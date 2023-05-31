package concesionario.model;

public class Van extends Vehiculo {
	/**
	 * atributos
	 */
	private double capacidadMaletero;
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
	 * @param capacidadMaletero
	 * @param aireAcondicionado
	 * @param camaraReversa
	 * @param nBolsasDeAire
	 * @param abs
	 * @param numeroChasis
	 */
	public Van(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, int nPasajeros, int nPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int nBolsasDeAire, boolean abs, String numeroChasis) {
		super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
		this.capacidadMaletero = capacidadMaletero;
	}


}
