package chapter09.lecture20240529;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class CheckBoxExampleApp extends Application {

	public void start(Stage primaryStage) throws Exception {
		CheckBox box = new CheckBox();
		
		box.setSelected(true);
		box.setText("Test?!");
		box.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println(box.isSelected());
			}
		});
		
		Scene value = new Scene(box, 300, 200);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();		
	}

}
