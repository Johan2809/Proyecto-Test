package concesionario.model;

public abstract class Vehiculo {
	protected String marca;
	protected boolean esNuevo;
	protected String modelo;
	protected int cambios;
	protected TipoTransmision tipoTransmision;
	protected TipoCombustible tipoCombustible;
	protected int velocidadMaxima;
    protected float cilindraje;
    protected boolean aireAcondicionado;
    protected int nPuertas;
    protected boolean camaraReversa;
    protected int nBolsasDeAire;
    protected int nPasajeros;
    protected boolean abs;

    public Vehiculo(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision, TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
    				int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs) {
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.cambios = cambios;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.aireAcondicionado = aireAcondicionado;
        this.nPuertas = nPuertas;
        this.camaraReversa = camaraReversa;
        this.nBolsasDeAire = nBolsasDeAire;
        this.nPasajeros = nPasajeros;
        this.abs = abs;

    }

	public boolean pasarRevisionTecnica() {
		// TODO Auto-generated method stub
		return false;
	}
}