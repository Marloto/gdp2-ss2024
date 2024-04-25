import java.util.Map;

import studiplayer.basic.TagReader;

public class TagMapExample {
	public static void main(String[] args) {
		Map<String, Object> tags = TagReader.readTags("audiofiles/Rock 812.mp3");
		
//		for (String tag : tags.keySet()) {
//			Object value = tags.get(tag);
//			System.out.printf("key: %-25s value: %-30s (type: %s)\n", tag, value, value.getClass().getSimpleName());
//		}
		
		Object object = tags.get("title");
		if(object != null) { // tags.containsKey			
			String title = (String) object;
			System.out.println(title);
		}
	}
}
