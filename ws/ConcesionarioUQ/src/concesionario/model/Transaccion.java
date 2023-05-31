package concesionario.model;

public class Transaccion {
    private Double precio;

    public Transaccion(Vehiculo vehiculo, Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
