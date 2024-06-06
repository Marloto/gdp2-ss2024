import javafx.application.Platform;
import javafx.scene.control.Button;

public class TimerThread extends Thread {
	private boolean stopped;
	private Button button;
	private int counter;

	public TimerThread(Button button) {
		this.button = button;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		while(!this.stopped) {
			Platform.runLater(() -> { // <-
				button.setText("Counter: " + counter ++);
			}); // <-
			
			
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
