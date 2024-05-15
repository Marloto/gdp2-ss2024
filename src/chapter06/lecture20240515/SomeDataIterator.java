package chapter06.lecture20240515;

import java.util.Iterator;

public class SomeDataIterator implements Iterator<String> {
	
	private Iterator<String> ref;

	public SomeDataIterator(Iterator<String> ref) {
		this.ref = ref;
	}

	public boolean hasNext() {
		if(Math.random() < 0.5) {
			return false;
		}
		return this.ref.hasNext();
	}

	public String next() {
		return this.ref.next();
	}

}
