package concesionario.model;

public class Camioneta extends Vehiculo{
	/**
	 * atributos
	 */
	private double capacidadMaletero;
	private boolean velocidadCrucero;
	private boolean sensorColision;
	private boolean sensorTraficoCruzado;
	private boolean asistenciaPermanenciaCarril;
    private boolean es4x4;
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
     * @param sensorColision
     * @param sensorTraficoCruzado
     * @param asistenciaPermanenciaCarril
     * @param es4x4
     * @param numeroChasis
     */

    public Camioneta(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
                     int nPasajeros, int nPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, boolean velocidadCrucero, int nBolsasDeAire, boolean abs, boolean sensorColision, boolean sensorTraficoCruzado,
                     boolean asistenciaPermanenciaCarril, boolean es4x4,String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje,aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.sensorColision = sensorColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistenciaPermanenciaCarril = asistenciaPermanenciaCarril;
        this.es4x4 = es4x4;

    }//VERIFICADO 2.0
}