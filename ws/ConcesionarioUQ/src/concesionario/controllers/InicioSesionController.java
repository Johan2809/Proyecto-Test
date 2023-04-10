package concesionario.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import concesionario.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InicioSesionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtContrasenia;

	private Aplicacion aplicacion;



    @FXML
//    void iniciarSesionEvent(ActionEvent event) {
//    	iniciarSesionAction();
//    }
//
////    private void iniciarSesionAction() {

//    	String usuario = "";
//    	String contrasenia = "";

//    	usuario = txtUsuario.getText();
//    	contrasenia = txtContrasenia.getText();

//  	if(datosValidos(usuario,contrasenia)){
//
//    		boolean usuarioValido = aplicacion.verificarUsuario(usuario,contrasenia);
//    		if(usuarioValido){
//    			aplicacion.mostrarVentanaInicioSesion();
//    		}else{
//    			mostrarMensaje("Notificaci�n Inicio sesion", "Usuario no existe", "Los datos ingresados no corresponde a un usuario valido", AlertType.INFORMATION);
//
//    		}
//    	}else{
//			mostrarMensaje("Notificaci�n Inicio sesion", "Datos Incompletos", "Debe ingresar los datos correctamente, despues de 3 intentos se bloqueara el usuario", AlertType.WARNING);
//
//    	}
//
//	}
    public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

		Alert alert = new Alert(alertType);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(contenido);
		alert.showAndWait();
	}
	private boolean datosValidos(String usuario, String contrasenia) {
		if(usuario.equals("") || contrasenia.equals("")){
			return false;
		}
		return true;
	}

	@FXML
    void initialize() {

    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion=aplicacion;

	}

}
