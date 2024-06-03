package chapter09.lecture20240603;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Elemente Horizontal / Vertikal anordnen über HBox / VBox
		
//		VBox box = new VBox();
//		HBox box = new HBox();
//		FlowPane box = new FlowPane();
//		box.getChildren().add(new Button("Button 5"));
//		box.getChildren().add(new Button("Button 6"));
//		box.getChildren().add(new Button("Button 6"));
//		box.getChildren().add(new Button("Button 6"));
//		box.getChildren().add(new Button("Button 6"));
//		box.getChildren().add(new Button("Button 6"));
//		GridPane box = new GridPane();
//		box.add(new Label("Kurz"), 0, 0);
//		box.add(new TextField("Button 6"), 1, 0);
//		box.add(new Button("Button 7"), 2, 0);
//		box.add(new Label("Laaaaaang"), 0, 1);
//		box.add(new TextField("Button 9"), 1, 1);
//		box.add(new Button("Button 10"), 2, 1);
		BorderPane box = new BorderPane();
        box.setTop(new Label("Top"));
        box.setLeft(new Label("Left"));
        box.setCenter(new Label("Center"));
        box.setRight(new Label("Right"));
        box.setBottom(new Label("Bottom"));
        
		VBox main = new VBox();
		main.getChildren().add(new Button("Button 1"));
		main.getChildren().add(new Button("Button 2"));
		main.getChildren().add(new Button("Button 3"));
		main.getChildren().add(new Button("Button 4"));
		main.getChildren().add(box);
		
		
		Scene scene = new Scene(main, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Layout App");
		primaryStage.show();
	}

}
