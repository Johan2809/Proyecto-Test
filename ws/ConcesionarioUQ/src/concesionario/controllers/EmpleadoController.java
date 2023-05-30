package concesionario.controllers;

import concesionario.application.Aplicacion;
import concesionario.exceptions.EmpleadoException;
import concesionario.model.Cliente;
import concesionario.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class EmpleadoController {

	Aplicacion Aplicacion;
	private Aplicacion aplicacion;
	Cliente clienteSeleccionado;
	private ObservableList<Empleado> listaClientesData = FXCollections.observableArrayList();

	public void setAplicacion(Aplicacion aplicacion) {
		this.Aplicacion = aplicacion;
	}

    @FXML
    private TextField txtContraseniaCliente;

    @FXML
    private TextField txtCorreoCliente;

    @FXML
    private Button btnGestionarVehiculos;

    @FXML
    private Button btnNuevoCliente;

    @FXML
    private TableColumn<Cliente, String> columnApellidosCliente;

    @FXML
    private TableView<Cliente> tableEstudiantes;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private TableColumn<Cliente, String> columnNombreCliente;

    @FXML
    private TableColumn<Cliente, String> columUsuarioCliente;

    @FXML
    private TableColumn<Cliente, String> columnIdentificacionCliente;

    @FXML
    private TextField txtUsuarioCliente;

    @FXML
    private TableColumn<Cliente, String> columContraseniaCliente;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtIdCliente;

    @FXML
    private TableColumn<Cliente, String> columCorreoCliente;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private Button btnAgregarCliente;



    @FXML
    void agregarClienteEvent(ActionEvent event) {
    	agregarCliente();
    }



    @FXML
    void actualizarClienteEvent(ActionEvent event) {
    	actualizarCliente();
    }



	@FXML
    void eliminarClienteEvent(ActionEvent event) {
		eliminarCliente();
    }

	@FXML
    void nuevoClienteEvent(ActionEvent event) {

    }

    @FXML
    void gestionarVehiculos(ActionEvent event) {
    	Aplicacion.mostrarGestionVehiculos("/concesionario/views/GestionVehiculosView.fxml");

    }
    private void agregarCliente() {}
//	    String nombre = txtNombreCliente.getText();
//	    String apellido = txtApellidoCliente.getText();
//	    String idCliente = txtIdCliente.getText();
//	    String usuario = txtUsuarioCliente.getText();
//	    String contrasenia = txtContraseniaCliente.getText();
//	    String correoElectronico = txtCorreoCliente.getText();
//
//		if(datosValidos(nombre, apellido, idCliente, usuario, contrasenia, correoElectronico) == true){
//
//			//3. Registrar el cliente
//			Cliente cliente = null;
//
//			try {
//				cliente = aplicacion.crearCliente(nombre, apellido, idCliente,usuario,contrasenia,correoElectronico);
//
//				listaClientesData.add(cliente);
//
//				mostrarMensaje("Notificacion", "Empleado registrado", "El empleado se ha registrado con extio", AlertType.INFORMATION);
//
//			} catch (EmpleadoException e) {
//				mostrarMensaje("Notificacion", "Un empleado con la misma identificacion ya se encuentra registrado", idEmpleado, AlertType.ERROR);
//			}
//		}
//		else{
//			mostrarMensaje("Notificacion", "Informacion invalida", "llene todos los campos para registrar un empleado", AlertType.ERROR);
//
//		}
//
//	}
	private void mostrarMensaje(String string, String string2, String string3, AlertType information) {
		// TODO Auto-generated method stub

	}



	private boolean datosValidos(String nombre, String apellido, String idCliente, String usuario, String contrasenia,
		    String correoElectronico) {

		    return !nombre.isEmpty() && !apellido.isEmpty() && !idCliente.isEmpty() &&
		        !usuario.isEmpty() && !contrasenia.isEmpty() && !correoElectronico.isEmpty();
		}



	private void actualizarCliente() {
		// TODO Auto-generated method stub

	}
    private void eliminarCliente() {
		// TODO Auto-generated method stub

	}

}
