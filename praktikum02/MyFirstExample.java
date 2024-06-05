import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFirstExample extends Application {

	private boolean useCertPlayList = false;
	private PlayerThread player;
	private TimerThread timer;
	private Button button;

	public void start(Stage primaryStage) throws Exception {
		
//		if(!useCertPlayList) {			
//			FileChooser fileChooser = new FileChooser();
//		}
		
		// Layouts aus der Vorlesung?
		// -> FlowPane, GridPane, HBox, VBox, BorderPane
		// -> VBox als GrundLayout, und dann je nach Bereich weitere Layouts zur Unterteilung
		// -> Setzen die einzelnen Controls als Instanzen um, einige als Felder in Klasse (Attribute)
		
		button = new Button("Hello");
		
		// Ereignisbehandlung sollte nicht die Verarbeitungslogik von JavaFX-Schleife blockieren, play würde dies!
		button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	// vgl audioFile.play();
                // starte PlayerThread mit Informationen
            	
            	sinnvolleMethode();
            }

        });
		
		Scene scene = new Scene(button, 200, 200);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	private void sinnvolleMethode() {
		player = new PlayerThread();
		player.start();
		timer = new TimerThread(button);
		timer.start();
	}
	
	public void setUseCertPlayList(boolean useCertPlayList) {
		this.useCertPlayList = useCertPlayList;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		launch(args);
	}


}
