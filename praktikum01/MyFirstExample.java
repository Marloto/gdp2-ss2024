import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstExample extends Application {

	private Button button;
	private PlayerThread player;
	private TimerThread timer;

	public void start(Stage primaryStage) throws Exception {
		
		button = new Button("Hello");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	someNiceMethod();
            	// unterschied: kein af.play()
            }

        });
		
		Scene scene = new Scene(button, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void someNiceMethod() {
		player = new PlayerThread();
		player.start();
		
		timer = new TimerThread(button);
		timer.start();
		
		// überprüfen Sie ob schon ein playerthread
		// existiert und stoppen Sie diesen, falls
		// Sie neue erzeugen wollen
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
