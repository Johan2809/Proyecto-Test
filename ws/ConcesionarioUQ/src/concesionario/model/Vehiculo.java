package concesionario.model;

public class Vehiculo {
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
	protected String numeroChasis;

	public Vehiculo(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,
			TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
			int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
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
		this.numeroChasis = numeroChasis;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEsNuevo() {
		return esNuevo;
	}

	public void setEsNuevo(boolean esNuevo) {
		this.esNuevo = esNuevo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public TipoTransmision getTipoTransmision() {
		return tipoTransmision;
	}

	public void setTipoTransmision(TipoTransmision tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}

	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public float getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(float cilindraje) {
		this.cilindraje = cilindraje;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	public boolean isCamaraReversa() {
		return camaraReversa;
	}

	public void setCamaraReversa(boolean camaraReversa) {
		this.camaraReversa = camaraReversa;
	}

	public int getnBolsasDeAire() {
		return nBolsasDeAire;
	}

	public void setnBolsasDeAire(int nBolsasDeAire) {
		this.nBolsasDeAire = nBolsasDeAire;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public String getNumeroChasis() {
		return numeroChasis;
	}

	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	public boolean pasarRevisionTecnica() {

		return false;
	}


	public void alquilar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	public boolean revisionTecnicaAprobada() {
		// TODO Auto-generated method stub
		return false;
	}

	public void vender(Cliente cliente) {
		// TODO Auto-generated method stub

	}
}