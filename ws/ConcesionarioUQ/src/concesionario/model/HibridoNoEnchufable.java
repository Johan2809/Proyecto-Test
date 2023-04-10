package concesionario.model;

public class HibridoNoEnchufable extends Vehiculo{
    private boolean esHibridoLigero;

    public HibridoNoEnchufable(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,int nPuertas, boolean camaraReversa, int nBolsasDeAire,int nPasajeros, boolean abs,
                               boolean esHibridoLigero) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs);
        this.esHibridoLigero = esHibridoLigero;
    }
}