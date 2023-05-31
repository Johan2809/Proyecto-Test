package concesionario.application;

import concesionario.controllers.AdministradorController;
import concesionario.controllers.EmpleadoController;
import concesionario.controllers.GestionarVehiculosController;
import concesionario.controllers.InicioSesionController;
import concesionario.exceptions.ClienteException;
import concesionario.exceptions.EmpleadoException;
import concesionario.model.Administrador;
import concesionario.model.Cliente;
import concesionario.model.Empleado;
import concesionario.model.Vehiculo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.ArrayList;

public class Aplicacion extends Application {
    private Stage escena = new Stage();
    private Administrador administrador;
    private Empleado empleado;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.escena = primaryStage;
        administrador = new Administrador();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/concesionario/views/InicioSesionView.fxml"));
        Parent root = loader.load();

        // Obtener el controlador y llamar al m�todo setStage() y setAplicacion()
        InicioSesionController controller = loader.getController();
        controller.setStage(primaryStage);
        controller.setAplicacion(this); // Nuevo

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void mostrarAdministrador(String ruta) {
        try {
            FXMLLoader ventana = new FXMLLoader();
            ventana.setLocation(Aplicacion.class.getResource(ruta));

            Parent root = ventana.load();
            AdministradorController administrador = ventana.getController();
            administrador.setAplicacion(this);

            administrador.setAdministrador(new Administrador());

            Scene scene = new Scene(root);
            escena.setScene(scene);
            escena.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarEmpleado(String ruta) {
        try {
            FXMLLoader ventana = new FXMLLoader();
            ventana.setLocation(Aplicacion.class.getResource(ruta));

            Parent root = ventana.load();
            EmpleadoController empleado = ventana.getController();
            empleado.setAplicacion(this);

            Scene scene = new Scene(root);
            escena.setScene(scene);
            escena.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mostrarGestionVehiculos(String ruta) {
        try {
            FXMLLoader ventana = new FXMLLoader();
            ventana.setLocation(Aplicacion.class.getResource(ruta));

            Parent root = ventana.load();
            GestionarVehiculosController empleado = ventana.getController();
            empleado.setAplicacion(this);

            Scene scene = new Scene(root);
            escena.setScene(scene);
            escena.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void mostrarLogin(String ruta) {
        try {
            FXMLLoader ventana = new FXMLLoader();
            ventana.setLocation(Aplicacion.class.getResource(ruta));

            Parent root = ventana.load();
            InicioSesionController controller = ventana.getController();
            controller.setAplicacion(this);

            Scene scene = new Scene(root);
            escena.setScene(scene);
            escena.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
//Crud empleado
    public Empleado crearEmpleado(String nombre, String apellido, String idEmpleado, String usuario,
                                  String contrasenia, String correoElectronico, String respuestaSeguridad) throws EmpleadoException {
        return administrador.registrarEmpleado(nombre, apellido, idEmpleado, usuario, contrasenia, correoElectronico,
                respuestaSeguridad);
    }

    public void actualizarEmpleado(String nombre, String apellido, String idEmpleado, String usuario,
                                   String contrasenia, String correoElectronico, String respuestaSeguridad) throws EmpleadoException {
        administrador.actualizarEmpleado(nombre, apellido, idEmpleado, usuario, contrasenia, correoElectronico,
                respuestaSeguridad);
    }

    public boolean eliminarEmpleado(String identificacion) {
        return administrador.eliminarEmpleado(identificacion);
    }
//Cliente
    public Cliente crearCliente(String nombre, String apellido,String idCliente, String usuario, String contrasenia, String correoElectronico) throws ClienteException {
        return empleado.registrarCliente(nombre,apellido,idCliente,usuario,contrasenia,correoElectronico);
    }

    public void actualizarCliente(String nombre, String apellido, String idCliente, String usuario, String contrasenia,
                                  String correoElectronico) throws ClienteException {
        empleado.actualizarCliente(nombre, apellido, idCliente, usuario, contrasenia, correoElectronico);
    }
//Vehiculo

    public ArrayList<Empleado> obtenerEmpleados() {
        return new ArrayList<>(administrador.getListaEmpleados());
    }

    public ArrayList<Cliente> obtenerClientes() {
        return new ArrayList<>(empleado.getListaClientes());
    }

    public static void main(String[] args) {
        launch(args);
    }


}
