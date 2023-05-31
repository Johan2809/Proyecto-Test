package concesionario.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String idCliente;
    private String usuario;
    private String contrasenia;
    private String correoElectronico;
    private List<Vehiculo> listaVehiculos;
    private List<Transaccion> listaTransacciones;
    private Empleado empleado;

    public Cliente() {
        super();
        this.listaVehiculos = new ArrayList<>();
        this.listaTransacciones = new ArrayList<>();
    }

    public Cliente(String nombre, String apellido, String idCliente, String usuario, String contrasenia, String correoElectronico) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.listaVehiculos = new ArrayList<>();
        this.listaTransacciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void agregarVenta(Vehiculo vehiculo, double precioVenta) {
        listaVehiculos.add(vehiculo);
        Transaccion transaccion = new Transaccion(vehiculo, precioVenta);
        listaTransacciones.add(transaccion);
    }
}

