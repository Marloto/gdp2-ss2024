
public class AudioFile {
	public AudioFile(String path) {
	}

	public AudioFile() {

	}

	public void parseFilename(String path) {

	}

	public void parsePathname(String path) {

	}

	public String getPathname() {
		return "file.mp3";
	}

	public String getFilename() {
		return "file.mp3";
	}

	public String getTitle() {
		return "";
	}

	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		AudioFile af = new AudioFile();
		af.parsePathname("file.mp3");
		System.out.println(af.getPathname());
		System.out.println(af.getFilename());

		// Shortcuts in Eclipse
		// -> Strg X / V / C
		// -> Verschieben Alt / Options + Pfeil Hoch / Runter
		// -> Duplizieren Alt / Options + Strg/Cmd + Pfeil Hoch / Runter
		// -> Löschen Strg / Cmd + D
		// -> Links: Strg / Cmd gedrückt halten + Klick
		// -> Outliner: Strg / Cmd + O
		// -> Auto Complete: Strg / Cmd + Leertaste, ESC zum schließen
		//    Es gibt Templates für schnelleres arbeiten, wie main und sysout
		// -> Content-Assist: Strg / Cmd + 1 (je nach Auswahl Vorschläge
		// für weitere Modifikationen)
		// -> Jump To Line: Strg / Cmd + L
		// -> Refactoring
		// Umbenennen ein spannendes Werkzeug, Strg/Cmd + Alt/Option + R
		// ESC für Abbruch, ENTER für Bestätigung
		// -> Auto Format: Strg / Cmd + Shift + F
		//    -> Hinweis: Vorsicht in existierenden Projekten!

		AudioFile audioFile2 = new AudioFile();
		String path = "file.mp3";
		audioFile2.parsePathname(path);
		
	}
}
