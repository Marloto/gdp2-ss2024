package chapter09.lecture20240529;

import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ChoiceBoxExample extends Application {
	public void start(Stage primaryStage) throws Exception {
		ChoiceBox<String> box = new ChoiceBox<String>();
		// Liste von Optionen wäre sinnvoll
		List<String> asList = Arrays.asList("A", "B", "C");
		ObservableList<String> observableArrayList = FXCollections.observableArrayList(asList);
		
		box.setItems(observableArrayList);
		
		Scene value = new Scene(box, 300, 200);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();	
	}
}
