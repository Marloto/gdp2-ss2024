package chapter09.lecture20240529;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class FirstApplication extends Application{
	
	private int counter = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label();
		Button root = new Button("Hello, World!");
		
		//root.setOnAction(new SomeActionHandler());
		root.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				// ActionEvent recht einfach, gibt das Element über getTarget an, welches hier "in action tritt"
				EventTarget target = event.getTarget();
				System.out.println(target);
				// was passiert wenn...
				System.out.println("Klick!");
				// spezielles Verhalten bei Wechselwirkung mit Attributen und Variablen
				root.setText("Klicked: " + (++ counter));
			}
		});
		
		root.setText("Klicked: nie");
		root.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				// MouseEvent enthält spezielle Informationen mit Bezug zur Maus, z.B. Position
			}
		});
		
//		root.setOnAction(event -> {
//			System.out.println("Klick!");
//		});
		
		// Frage: wie können wir jeden Klicken zählen und den Button dann mit der Zahl der Zählung verändern?
		// -> counter
		// -> wohin? attribut od. statisches attribut
		// -> referenz auf den Button, eventuell im Event-Attribut
		//    -> was bietet eine Klasse Button zum Verändern von Text
		
		Scene value = new Scene(root, 300, 200);
		primaryStage.setScene(value);
		primaryStage.setTitle("My first Stage!");
		primaryStage.show();
	}

}
