package concesionario.application;

import concesionario.controllers.AdministradorController;
import concesionario.controllers.InicioSesionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Aplicacion extends Application {
	private Stage escena = new Stage();


@Override
public void start(Stage primaryStage) throws Exception {
    this.escena = primaryStage;
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/concesionario/views/InicioSesionView.fxml"));
    Parent root = loader.load();

    // Obtener el controlador y llamar al método setStage() y setAplicacion()
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

			Scene scene = new Scene(root);
			escena.setScene(scene);
			escena.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
