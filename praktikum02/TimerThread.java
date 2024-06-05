import javafx.application.Platform;
import javafx.scene.control.Button;
import studiplayer.basic.BasicPlayer;

public class TimerThread extends Thread {

	private boolean stopped;
	private Button button;
	
	int counter = 0;

	public TimerThread(Button button) {
		this.button = button;
	}
	
	public void run() {
		// Aufgabe: stellen Sie die Abspielzeit dar
		
		while(!this.stopped) {
			// Spezieller Aufruf, der eine Instanz der Schnittstelle
			// Runable hinterlegt und im JavaFX-Thread ausführt
			Platform.runLater(() -> {

				button.setText("Counter " + counter++);
				
			});
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void terminate() {
		this.stopped = true;
	}
}
