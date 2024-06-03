package chapter09.lecture20240529;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TextFieldApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField field = new TextField();
		
		// Eingegeben Text ein- / auslesen
		field.setText("initial Input");
		
		field.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println(field.getText());
			}
		});
		
		
		
		
		Scene value = new Scene(field, 300, 200);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();	
	}

}
