package concesionario.model;

public class Moto extends Vehiculo{
	/**
	 * constructor moto
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

	public Moto(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
			int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
		super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado,
				nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);

	}

	public void Motos(String marca, String estado, Integer modelo, Integer cambios, Object tipoTransmision,
			Object tipoCombustible, String velocidadMaxima, String cilindraje, boolean aireAcondicionado, int nPuertas,
			boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
		// TODO Auto-generated constructor stub
	}


	}
