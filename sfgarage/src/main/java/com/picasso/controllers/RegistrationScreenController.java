package com.picasso.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.picasso.utils.ScreenNavigator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class RegistrationScreenController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button btnRegistration;

	@FXML
	private Button btnLoginScreen;

	@FXML
	private ChoiceBox<String> cboxRol;

	@FXML
	private ImageView imgLogo;

	@FXML
	private ImageView imgTopLogo;

	@FXML
	private Pane infoPane;

	@FXML
	private Label lblError;

	@FXML
	private Label lblLoginTitle;

	@FXML
	private Label lblTxtFieldNombre1;

	@FXML
	private Label lblTxtFieldNombre2;

	@FXML
	private Label lblTxtFieldNombre21;

	@FXML
	private Label lblTxtFieldNombre211;

	@FXML
	private Label lblTxtFieldPassword;

	@FXML
	private Label lblTxtFieldPassword1;

	@FXML
	private Pane paneWhiteLine;

	@FXML
	private Pane registrationPane;

	@FXML
	private Pane topPane;

	@FXML
	private TextField txtDni;

	@FXML
	private TextField txtName;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private PasswordField txtPasswordConfirm;

	@FXML
	private TextField txtSurnames;

	@FXML
	void btnLoginPressed(MouseEvent event) {

	}

	@FXML
	void btnLoginScreenPressed(MouseEvent event) {
		ScreenNavigator loginNav = new ScreenNavigator("Pantalla de Login", "/com/picasso/views/LoginScreen.fxml",
				"/com/picasso/styles/loginStyle.css");
		loginNav.closeWindow(event);
		loginNav.navigate();
	}

	@FXML
	void initialize() {
		// Añade elementos a cbox
		cboxRol.getItems().addAll("Administrador", "Mecánico", "Agente");
		// Elemento por defecto
		cboxRol.setValue("Agente");
	}

}
