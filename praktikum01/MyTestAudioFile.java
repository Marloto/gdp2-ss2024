import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTestAudioFile {
	@Test
	public void test_parse_01() {
		AudioFile file = new AudioFile();
		
		// Verarbeiten
		file.parsePathname("file.mp3");
		
		// Methoden auslesen
		String filename = file.getFilename();
		String pathname = file.getPathname();
		
		// Nicht Ausgeben, sondern Testen
		assertEquals("file.mp3", pathname);
		assertEquals("file.mp3", filename);
	}
	@Test
	public void test_parse_02() {
		AudioFile file = new AudioFile();
		
		// Verarbeiten
		file.parsePathname("  /my-tmp/file.mp3");
		
		// Methoden auslesen
		String filename = file.getFilename();
		String pathname = file.getPathname();
		
		// Ausgeben
		assertEquals("  /my-tmp/file.mp3", pathname);
		assertEquals("file.mp3", filename);
	}
}
