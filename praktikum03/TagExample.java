import java.util.Map;
import java.util.Set;

import studiplayer.basic.BasicPlayer;
import studiplayer.basic.TagReader;

public class TagExample {
	public static void main(String[] args) {
		//BasicPlayer.play("audiofiles/Rock 812.mp3");
		// System.out.println("Test!");
		
		String pathname = "audiofiles/Rock 812.mp3";
		
		
		Map<String, Object> tags = TagReader.readTags(pathname);
		for (String key : tags.keySet()) {
			Object value = tags.get(key);
			System.out.printf("key: %-25s value: %-30s (type: %s)\n", 
					key, value, value.getClass().getSimpleName());
		}
		
		Object object = tags.get("title");
		if(object != null && object instanceof String) {
			String title = (String) object;
			// normal weiter arbeiten, z.B. in attribute speichern
			System.out.println(title.trim());
		}
	}
}
