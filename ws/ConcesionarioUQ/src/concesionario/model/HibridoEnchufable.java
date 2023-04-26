package concesionario.model;

public class HibridoEnchufable extends VehiculoElectrico{
    public HibridoEnchufable(String marca, boolean esNuevo, String modelo, int cambios,TipoTransmision tipoTransmision,TipoCombustible tipoCombustible, int velocidadMaxima, int cilindraje, boolean aireAcondicionado, int nPuertas, boolean camaraReversa, int nBolsasDeAire, int nPasajeros, boolean abs,
                             int autonomiaCargaCompleta, int tiempoCarga, String numeroChasis) {
        super(marca, esNuevo, modelo, cambios, tipoTransmision, tipoCombustible, velocidadMaxima, cilindraje, aireAcondicionado, autonomiaCargaCompleta, tiempoCarga, true, nPuertas, camaraReversa, nBolsasDeAire, nPasajeros, abs, numeroChasis);
    }
}