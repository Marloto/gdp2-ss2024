import java.util.Collection;
import java.util.Map;
import java.util.Set;

import studiplayer.basic.TagReader;

public class TagExample {
	public static void main(String[] args) {
		Map<String, Object> tags = TagReader.readTags("audiofiles/Rock 812.mp3");
		Set<String> keys = tags.keySet();
		for(String key : keys) {
			Object value = tags.get(key);
			System.out.println(key + "(" + value.getClass().getSimpleName() + "): " + value);
		}
		
		Object object = tags.get("title");
		if(object != null) {			
			String title = (String) object;
			System.out.println(title);
		}

	}
}
