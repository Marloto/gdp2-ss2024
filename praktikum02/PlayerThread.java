import studiplayer.basic.BasicPlayer;

public class PlayerThread extends Thread {
	
	private boolean stopped;

	public PlayerThread() {
	}
	
	public void run() {
		// Aufgabe: spielen Sie die PlayList
		//   solange ab, bis gestoppt wird :)
		
		while(!this.stopped) {
			// AudioFile af = PlayList.currentAudioFile()
			
			// vgl. af.play()
			BasicPlayer.play("audiofiles/Rock 812.mp3"); // <- aufruf ist blockierend!
			
			// prüfen Sie ob gestoppt?! ansonsten playList.nextSong()

		}
		
	}
	
	public void terminate() {
		this.stopped = true;
	}

}
