package chapter09.lecture20240527;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FirstApplication extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label root = new Label("Hello, World!");
		Scene value = new Scene(root);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();
	}

}
