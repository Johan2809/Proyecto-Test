package concesionario.model;

public class Bus extends Vehiculo{
	/**
	 * atributos
	 */
    private int capacidadMaletero;
    private int nEjes;
    private int nSalidasEmergencia;
    public Bus(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision ,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
               int nPasajeros, int nPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa,
               int nBolsasAire, boolean abs, int nEjes, int nSalidasEmergencia, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje,aireAcondicionado, nPuertas, camaraReversa, nBolsasAire, nPasajeros, abs, numeroChasis);
        this.capacidadMaletero = capacidadMaletero;
        this.nEjes = nEjes;
        this.nSalidasEmergencia = nSalidasEmergencia;
    }
}//VERIFICADO 2.0