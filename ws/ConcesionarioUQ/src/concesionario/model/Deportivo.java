package concesionario.model;

public class Deportivo extends Vehiculo{
	/**
	 * atributos
	 */
    private int numCaballosFuerza;
    private int tiempo0a100kmh;
//DATOS PROPIEDADES NO SE SABE QUE ES
    public Deportivo(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, int nPasajeros, int nPuertas,
    				int nBolsasAire, int numCaballosFuerza, int tiempo0a100kmh, boolean aireAcondicionado, boolean camaraReversa, boolean abs, String numeroChasis ) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasAire, nPasajeros, abs, numeroChasis);
        this.numCaballosFuerza = numCaballosFuerza;
        this.tiempo0a100kmh = tiempo0a100kmh;
    }
}//VERIFICADO 2.0