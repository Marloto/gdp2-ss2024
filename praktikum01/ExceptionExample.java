import java.io.File;

public class ExceptionExample {
	public static void main(String[] args) {
		String pathname = "audiofiles/Rock 812.mp3";
		File file = new File(pathname);
		boolean canRead = file.canRead();
		
		// Wirft eine Ausnahme, damit beendet sich die Ausführung der Anwendung
		if(!canRead)
			throw new RuntimeException("Test");
	}
}
