import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFancyTest {
	@Test // <- Annotation, falls man nachschauen möchte
	public void testPathname01() {
		AudioFile file = new AudioFile();
		file.parsePathname("/test/some.mp3");
		String pathname = file.getPathname();
		String filename = file.getFilename();
		
		assertEquals("/test/some.mp3", pathname);
		assertEquals("some.mp3", filename);
	}
}
