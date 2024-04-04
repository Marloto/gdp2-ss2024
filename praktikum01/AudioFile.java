public class AudioFile {
	public AudioFile() {

	}

	public String getPathname() {
		return "file.mp3";
	}

	public String getFilename() {
		return "file.mp3";
	}

	public void parsePathname(String path) {

	}

	public static void main(String[] args) {
		AudioFile file = new AudioFile();
		
		// Verarbeiten
		file.parsePathname("file.mp3");
		
		// Methoden auslesen
		String pathname = file.getPathname();
		String filename = file.getFilename();
		
		// Ausgeben
		System.out.println(pathname);
		System.out.println(filename);
		
		// Shortcuts in Eclipse und weitere Infos
		// -> Strg X / V / C
		// -> Verschieben: Option / Alt + Pfeiltasten Hoch / Runter (zeile oder markierten Block)
		// -> Duplizieren: Cmd/Strg + Option/Alt + Pfeil Hoch / Runter (zeile oder block)
		// -> Delete: Cmd/Strg + D
		// -> Auto Complete: Ctrg + Leertaste  od. ESC zum Schließen
		//    zzgl. Templates aus den Einstellungen wie "main" und "syso"
		// -> Content Assist: Cmd / Ctrg + 1  je nach Fehler und Auswahl vorschläge zur Modifikation
		// -> Outline: Cmd/Strg + O
		// -> Jump To Line: Cmd / Strg + L
		// -> Links: Cmd / Strg gedrückthalten zzgl. Klick auf Element
		// -> über History zurück springen
		// -> Auto Format: Cmd/Strg + Shift + F (ganze datei oder auswahl)
		// -> Refactoring zum Überarbeiten von Quellcode
		//    -> Renaming mit Cmd /Ctrl + Option / Alt + R, ESC zum Abbrechen, Enter zum bestätigen
		
		AudioFile audioFile = new AudioFile();
		audioFile.parsePathname(pathname);
		String foo = "";
		
		
	}
}
