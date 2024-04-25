import java.io.File;

public class Va07Test {
	public static void main(String[] args) {
		File file = new File("path/xyz.mp3");
		if(!file.canRead())
			throw new RuntimeException("Some Test");
	}
}
