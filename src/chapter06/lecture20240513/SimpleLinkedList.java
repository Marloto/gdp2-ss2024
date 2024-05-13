package chapter06.lecture20240513;

public class SimpleLinkedList<T> {
	private Element<T> first;
	private Element<T> last;
	
	private int size;
	
	// https://t1p.de/4dp5j
	
	public void add(T value) {
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
	}
	
	private Element<T> findByValue(T value) {
		Element<T> current = first; // 
		while (current != null) {
			if(current.getValue() == value) { // 
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	
	public boolean remove(T value) {
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
}
