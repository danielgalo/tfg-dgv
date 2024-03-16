package com.picasso.controllers;

import com.picasso.utils.FieldUtils;
import com.picasso.utils.ScreenNavigator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class LoginScreenController {

	@FXML
	private Button btnLogin;

	@FXML
	private Button btnRegister;

	@FXML
	private Pane infoPane;

	@FXML
	private Label lblError;

	@FXML
	private Label lblLoginTitle;

	@FXML
	private Label lblPasswordForgotten;

	@FXML
	private Label lblPasswordForgotten1;

	@FXML
	private Label lblTxtFieldNombre;

	@FXML
	private Label lblTxtFieldPassword;

	@FXML
	private Pane loginPane;

	@FXML
	private Pane paneWhiteLine;

	@FXML
	private Pane topPane;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private TextField txtUsername;

	@FXML
	private ImageView imgLogo;

	@FXML
	private ImageView imgTopLogo;

	@FXML
	void initialize() {

		imgLogo.setImage(new Image("/com/picasso/images/logo.png"));
		imgTopLogo.setImage(new Image("/com/picasso/images/logo2.png"));

	}

	@FXML
	void btnLoginPressed(MouseEvent event) {

		String username = txtUsername.getText();
		String password = txtPassword.getText();

		if (FieldUtils.fieldsNull(username, password) || FieldUtils.fieldsEmpty(username, password)) {
			lblError.setText("Rellene todos los campos para acceder.");
		} else {
			// Comprobacion BD
			lblError.setText("");

		}

	}

	@FXML
	void btnRegisterPressed(MouseEvent event) {

		ScreenNavigator registrationNav = new ScreenNavigator("Pantalla de Registro",
				"/com/picasso/views/RegistrationScreen.fxml", "/com/picasso/styles/registrationStyle.css");
		registrationNav.closeWindow(event);
		registrationNav.navigate();

	}

	@FXML
	void passwordForgottenPressed(MouseEvent event) {

	}

}
