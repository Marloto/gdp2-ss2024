import studiplayer.audio.AudioFile;
import studiplayer.audio.NotPlayableException;
import studiplayer.audio.TaggedFile;

public class PlayerThread extends Thread {
	private boolean stopped;

	public void run() {
		// <- das hier ist der neue "start"
		//    eines parallen callstacks / "prozess"
		
		while(!this.stopped) {
			try {
        		AudioFile af = new TaggedFile("audiofiles/Rock 812.mp3");
        		af.play();
        	} catch(NotPlayableException e) {
        		e.printStackTrace();
        	}
		}
	}
	
	public void terminate() {
		// aktuelles Lied beziehen
		// af.stop();
		this.stopped = true;
	}
}
