// Kein Package
// wenn da, weglöschen und fehler anklicken
// -> move to default package

public class HelloWorldExample {
	public static void main(String[] args) {
		// Hinweise
		// -> Strg / Cmd + O für Outliner
		// -> Doppelklick auf Tab für maximale Größe
		// -> Strg / Cmd + C/V/X
		// -> Alt + Pfeil Hoch / Runter
		// -> Strg + Alt + Hoch / Runter oder (mac) Cmd+Option+Pfeil Hoch/Runter
		// -> Strg/Cmd + D
		// -> Strg / Cmd gedrückt halten
		// -> Content-Assist Strg/Cmd + 1
		// -> Auto-Complete (Strg + Leertaste) - Wegklicken mit ESC
		// -> Refactoring-Renaming: Strg + Alt + R / Cmd + Option + R
		
		if(true) {
			AudioFile audioFile = new AudioFile();
			String path = "test";
			audioFile.parseFilename(path);
		}
		
		System.out.println("Hello, World!");
		System.out.println("Hello, World!");
		System.out.println();
	}
	
	public String doSomethingWithManyWords() {
		return null;
	}
}
