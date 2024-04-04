import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTestAudioFile {
	@Test
	public void test_parsePathname_01() {
		AudioFile af = new AudioFile();
		af.parsePathname("file.mp3");
		assertEquals("file.mp3", af.getPathname());
		assertEquals("file.mp3", af.getFilename());
		//System.out.println(af.getFilename());
		//System.out.println(af.getPathname());
	}
	
	@Test
	public void test_parsePathname_02() {
		AudioFile af = new AudioFile();
		af.parsePathname("  /my-tmp/file.mp3");
		assertEquals("  /my-tmp/file.mp3", af.getPathname());
		assertEquals("file.mp3", af.getFilename());
	}
}
