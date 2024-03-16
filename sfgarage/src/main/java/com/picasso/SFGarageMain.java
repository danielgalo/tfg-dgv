package com.picasso;

import com.picasso.utils.ScreenNavigator;

import javafx.application.Application;
import javafx.stage.Stage;

public class SFGarageMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScreenNavigator loginNav = new ScreenNavigator("Pantalla de Login", "/com/picasso/views/LoginScreen.fxml",
				"/com/picasso/styles/loginStyle.css");
		loginNav.navigate();

//		try {
//			// Obtener la sesión de HibernateUtil
//			Session session = HibernateUtil.getSession();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// Cerrar la sesión al finalizar
//			HibernateUtil.closeSession();
//		}
	}

}
