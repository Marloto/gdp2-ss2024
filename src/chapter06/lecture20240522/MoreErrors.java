package chapter06.lecture20240522;

import java.io.IOException;

class SomeErrors {
	public void doSomething(int i) throws Exception {
		if (i < 10) {
			throw new Exception("i muss größer oder gleich 10 sein");
		}
	}
}

public class MoreErrors extends SomeErrors {
	public MoreErrors() throws Exception {
		super.doSomething(9);
	}

	public void doSomething(int i) { // <- weniger fehler geht, nicht mehr bei Überschreiben
		System.out.println("Hello, World!");	
	}

	public static void main(String[] args) {
		try {
			SomeErrors errors = new MoreErrors();
			errors.doSomething(0);
	
			SomeErrors errors2 = new SomeErrors();
			errors2.doSomething(0);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}