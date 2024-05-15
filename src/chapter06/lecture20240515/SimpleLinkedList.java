package chapter06.lecture20240515;

import java.util.Iterator;
import java.util.List;

// Generelle Frage: wie können wir diese eigene Klasse mit den Standards von Collections für Java kombinieren - was muss verändert werden?
// -> was war List? Klasse od. Schnittstelle?


public class SimpleLinkedList<T> implements Iterable<T> { // < was muss hier als Typ für E verwendet werden? Variante Object:
	private Element<T> first;
	private Element<T> last;
	
	private int size;
	
	// https://t1p.de/4dp5j
	
	public boolean add(T value) {
		Element<T> oldLast = last;
		Element<T> element = new Element<T>(value, oldLast);
		last = element;
		if(first == null) {			
			first = element;
		}
		if(oldLast != null) {			
			oldLast.setNext(element);
		}
		
		size ++;
		return true;
	}
	
	private Element<T> findByValue(Object value) {
		Element<T> current = first; // 
		while (current != null) {
			if(current.getValue().equals(value)) { // 
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	
	public boolean remove(Object value) {
		// was ist nötig?
		// suchen von Element mit value 
		Element<T> elementToRemove = findByValue(value);
		if(elementToRemove == null) {
			return false;
		}
		
		// Referenzen anpassen
		Element<T> previous = elementToRemove.getPrevious();
		Element<T> next = elementToRemove.getNext();
		
		size --;
		
		if(previous == elementToRemove && next == elementToRemove) {
			last = null;
			first = null;
			return true;
		}
		
		if(previous != null && next != null) {
			previous.setNext(next);
			next.setPrevious(previous);
		} else if(previous != null) {
			previous.setNext(null);
			last = previous;
		} else if(next != null) {
			next.setPrevious(null);
			first = next;
		}
		return true;
	}
	
	public boolean isEmpty() {
		return first == null && last == null;
	}
	
	public int size() {
		// (a) Schleife iterieren über alle Elemente
		// (b) Attribut zum zählen
		return size;
	}
	
	public T getFirst() {
		return first.getValue();
	}
	
	public T getLast() {
		return last.getValue();
	}

	public Iterator<T> iterator() {
		return new SimpleLinkedListIterator<T>(first);
	}
}











