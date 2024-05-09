package chapter06.lecture20240508;


class KeyValuePair<A> {
	private String name;
	private A value;
	
	public KeyValuePair(String name, A value) {
		this.name = name;
		this.value = value;
		
		A abc = value;
	}

	public String getName() {
		return name;
	}
	
	public A getValue() {
		return value;
	}
}

public class GenericsExample {
	public static void main(String[] args) {
		KeyValuePair<Integer> keyValuePair = new KeyValuePair<Integer>("some-key", 12);
		Integer value = keyValuePair.getValue();
	}
}
