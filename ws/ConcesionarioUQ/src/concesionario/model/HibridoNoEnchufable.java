package concesionario.model;

public class HibridoNoEnchufable extends Vehiculo{
	/**
	 * atributo
	 */
    private boolean esHibridoLigero;
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
 * @param esHibridoLigero
 * @param numeroChasis
 */
    public HibridoNoEnchufable(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,int nPuertas, boolean camaraReversa, int nBolsasDeAire,int nPasajeros, boolean abs,
                               boolean esHibridoLigero, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
        this.setEsHibridoLigero(esHibridoLigero);
    }

	public boolean isEsHibridoLigero() {
		return esHibridoLigero;
	}

	public void setEsHibridoLigero(boolean esHibridoLigero) {
		this.esHibridoLigero = esHibridoLigero;
	}
}