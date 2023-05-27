package concesionario.controllers;

import concesionario.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdministradorController {

	private Stage stage;
	public void setStage(Stage primaryStage) {
	    this.stage = primaryStage;
	}

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    private TextField txtCorreoEmpleado;

    @FXML
    private TextField txtRespuSeguridadEmpleado;

    @FXML
    private Button btnNuevoEmpleado;

    @FXML
    private TextField txtContraseniaEmpleado;

    @FXML
    private Button btnAgregarEmpleado;

    @FXML
    private TableView<?> tableEstudiantes;

    @FXML
    private TextField txtApellidoEmpleado;

    @FXML
    private TableColumn<?, ?> columnNombreEmpleado;

    @FXML
    private TableColumn<?, ?> columnIdEmpleado;

    @FXML
    private TableColumn<?, ?> columCodigoTransaccion;

    @FXML
    private TableColumn<?, ?> columTipoTransaccion;

    @FXML
    private TextField txtContrasenia1;

    @FXML
    private Button btnEliminarEmpleado;

    @FXML
    private Button btnActualizarEmpleado;

    @FXML
    private TextField txtContrasenia2;

    @FXML
    private TableColumn<?, ?> columFechaTransaccion;

    @FXML
    private TextField txtUsuarioEmpleado;

    @FXML
    private TableColumn<?, ?> columnApellidosEmpleado;

    @FXML
    private Button btnBloquearEmpleado;

    @FXML
    private TextField txtIdEmpleado;

	private Aplicacion aplicacion;



    @FXML
    void agregarEmpleadoEvent(ActionEvent event) {

    }

    @FXML
    void bloquearEmpleadoEvent(ActionEvent event) {

    }



    @FXML
    void nuevoEmpleadoEvent(ActionEvent event) {

    }

    @FXML
    void eliminarEmpleadoEvent(ActionEvent event) {

    }

    @FXML
    void actualizarEmpleadoEvent(ActionEvent event) {

    }

	public void setAplicacion(Aplicacion aplicacion){
		this.aplicacion = aplicacion;

	}

}