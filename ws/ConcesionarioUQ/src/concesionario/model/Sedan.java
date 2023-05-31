package concesionario.model;

public class Sedan extends Vehiculo{
	/**
	 * atributos
	 */
    private int capacidadMaletero;
    private boolean velocidadCrucero;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;
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
 * @param velocidadCrucero
 * @param nBolsasDeAire
 * @param abs
 * @param sensoresColision
 * @param sensorTraficoCruzado
 * @param asistentePermanenciaCarril
 * @param numeroChasis
 */
    public Sedan(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, int nPasajeros,
                int nPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero,
                int nBolsasDeAire, boolean abs, boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }
}//VERIFICADO 2.0