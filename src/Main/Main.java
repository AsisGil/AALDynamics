package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("/InterfazGrafica/login.fxml"));
			Scene scene = new Scene(root);

			primaryStage.setTitle("AALDynamics");
			primaryStage.setScene(scene);
			scene.getStylesheets().add(Main.class.getResource("/Estilos/estilos.css").toExternalForm());
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}