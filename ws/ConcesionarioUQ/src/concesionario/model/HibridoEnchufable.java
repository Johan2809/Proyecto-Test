package concesionario.model;

public class HibridoEnchufable extends VehiculoElectrico{
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
	 * @param aireAcondicionado
	 * @param nPuertas
	 * @param camaraReversa
	 * @param nBolsasDeAire
	 * @param nPasajeros
	 * @param abs
	 * @param autonomiaCargaCompleta
	 * @param tiempoCarga
	 * @param numeroChasis
	 */
    public HibridoEnchufable(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs,
                             int autonomiaCargaCompleta, int tiempoCarga, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, autonomiaCargaCompleta, tiempoCarga, true, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
    }
}