package concesionario.model;

public class PickUp extends Vehiculo {
	private boolean es4x4;
	private double capacidadCajaCarga;
	public PickUp(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, int nPasajeros, int nPuertas, boolean aireAcondicionado, boolean camaraReversa, int nBolsasDeAire, boolean abs, boolean es4x4, double capacidadCajaCarga) {
		super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs);
		this.es4x4 = es4x4;
		this.capacidadCajaCarga = capacidadCajaCarga;
	}
}

