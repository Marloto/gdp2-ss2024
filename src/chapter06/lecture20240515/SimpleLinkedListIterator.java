package chapter06.lecture20240515;

import java.util.Iterator;

public class SimpleLinkedListIterator<T> implements Iterator<T> {

	private Element<T> current;

	// Übergeben Sie alle Informationen die für die Iteration
	// notwendig sind
	public SimpleLinkedListIterator(Element<T> first) {
		current = first;
	}
	
	// Was ist die Schleifenbedingung?
	public boolean hasNext() {
		return current != null;
	}

	// Wie kommt man an das nächste Element
	// -> gehen Sie direkt zum nachfolgenden
	public T next() {
		T value = current.getValue();
		current = current.getNext();
		return value;
	} 

}
