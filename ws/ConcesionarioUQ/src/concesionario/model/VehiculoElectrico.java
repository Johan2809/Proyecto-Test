package concesionario.model;

public class VehiculoElectrico extends Vehiculo{
    private int autonomiaCargaCompleta;
    private int tiempoCarga;
    private boolean esEnchufable;

    public VehiculoElectrico(String marca, boolean esNuevo, String modelo, int cambios, TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado,
                             int autonomiaCargaCompleta, int tiempoCarga, boolean esEnchufable, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
        this.autonomiaCargaCompleta = autonomiaCargaCompleta;
        this.tiempoCarga = tiempoCarga;
        this.esEnchufable = esEnchufable;
    }
}