package concesionario.model;

public class VehiculoElectrico extends Vehiculo{
	/**
	 * atributos
	 */
    private int autonomiaCargaCompleta;
    private int tiempoCarga;
    private boolean esEnchufable;
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
 * @param autonomiaCargaCompleta
 * @param tiempoCarga
 * @param esEnchufable
 * @param nPuertas
 * @param camaraReversa
 * @param nBolsasDeAire
 * @param nPasajeros
 * @param abs
 * @param numeroChasis
 */
    public VehiculoElectrico(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
                             int autonomiaCargaCompleta, int tiempoCarga, boolean esEnchufable, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoCarga = tiempoCarga;
        this.esEnchufable = esEnchufable;
    }
}