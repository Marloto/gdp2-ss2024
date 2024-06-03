package chapter09.lecture20240529;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {

	public void start(Stage primaryStage) throws Exception {
		ToggleGroup group1 = new ToggleGroup();
		RadioButton button1 = new RadioButton("Opt. 1");
		button1.setToggleGroup(group1);
		RadioButton button2 = new RadioButton("Opt. 2");
		button2.setToggleGroup(group1);
		
		// Layout -> ermöglicht das verwenden von mehreren Controls od. Layouts und schaft Strukturen
		
		VBox box = new VBox();
		List<Node> children = box.getChildren();
		children.add(button1);
		children.add(button2);
		
		Scene value = new Scene(box, 300, 200);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();		
	}

}
