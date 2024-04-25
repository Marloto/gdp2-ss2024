import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		String pathname = "audiofiles/Rock 813.mp3";
		File file = new File(pathname);
		boolean canRead = file.canRead();
		if(!canRead) {
			// throw -> sorgt dafür, dass der Fehler "ausgelöst" / "geworfen"
			// hinter dem Throw muss eine Objekt-Referenz angegeben werden
			// die von einem Typ "Throwable" bzw. "Exception" abstammt
			// Test ersetzen gegen etwas hilfreiches, z.B. mit dem pfad
			// der nicht gefunden wurde
			RuntimeException error = new RuntimeException("Test!");
			
			throw error;
			// throw new RuntimeException("Test!");
			// vgl. "return <res>"
		}
		System.out.println("Test");
	}
}
