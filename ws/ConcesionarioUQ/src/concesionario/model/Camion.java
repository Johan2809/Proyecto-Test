package concesionario.model;

public class Camion extends Vehiculo{
	/**
	 * atributos
	 */
	private double capacidadDeCarga;
	private boolean frenosDeAire;
	private int nEjes;
//	tipoCamion tipoCamion;
	public Camion(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje,
			double capacidadDeCarga, boolean aireAcondicionado, boolean frenosDeAire, boolean abs, int nEjes, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, String numeroChasis) {
		super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
		this.capacidadDeCarga=capacidadDeCarga;
		this.frenosDeAire= frenosDeAire;
		this.nEjes=nEjes;
	}

}//VERIFICADO 2.0 FALTA EL TIPO DE CAMION