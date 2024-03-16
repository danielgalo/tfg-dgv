package com.picasso.utils;

import java.io.IOException;

import com.picasso.SFGarageMain;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Class used to manage events related to screen navigation
 */
public class ScreenNavigator {

	/** Window title */
	private String windowTitle;

	/** Path to the FXML file */
	private String fxmlPath;

	/** Path to the CSS file */
	private String styleSheet;

	/**
	 * Consturctor
	 * 
	 * @param windowTitle     window title
	 * @param rutaArchivoFxml path to the FXML file to open
	 * @param styleSheet      path to the CSS file attached to the window
	 */
	public ScreenNavigator(String windowTitle, String fxmlPath, String styleSheet) {
		this.windowTitle = windowTitle;
		this.fxmlPath = fxmlPath;
		this.styleSheet = styleSheet;
	}

	/**
	 * Navigate to the screen
	 */
	public void navigate() {
		try {
			// Crear Stage
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader();
			// Cargar la clase
			loader.setLocation(SFGarageMain.class.getResource(fxmlPath));
			// Crear la ventana
			Pane ventana = (Pane) loader.load();
			Scene scene = new Scene(ventana);
			// Añadirle los estilos
			String urlCss = getClass().getResource(styleSheet).toExternalForm();
			scene.getStylesheets().add(urlCss);
			// Mostrar la pantalla
			stage.setTitle(windowTitle);
			stage.setScene(scene);
			// Hacer que la ventana no se pueda cambiar de tamaño
			stage.setResizable(false);

			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Closes actual window
	 * 
	 * @param event mouse event
	 */
	public void closeWindow(MouseEvent event) {
		// Obtener la escena y la ventana actual
		Scene scene = ((Node) event.getSource()).getScene();
		Stage stage = (Stage) scene.getWindow();

		// Cerrar la ventana actual
		stage.close();
	}

}
