package concesionario.controllers;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class VentaPrincipalController {
	@FXML
	private Label labelMensaje;

	// Event Listener on Button.onAction
	@FXML
	public void btnPresionar(ActionEvent event) {
		labelMensaje.setText("Ensayando la interfaz");
	}
}