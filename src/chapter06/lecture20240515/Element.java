package chapter06.lecture20240515;

public class Element<V> {
	private V value;
	private Element<V> next;
	private Element<V> previous;
	
	public Element(V value, Element<V> previous) {
		this.value = value;
		this.previous = previous;
	}
	
	public V getValue() {
		return value;
	}
	
	public Element<V> getNext() {
		return next;
	}
	
	public void setNext(Element<V> next) {
		this.next = next;
	}
	
	public Element<V> getPrevious() {
		return previous;
	}
	
	public void setPrevious(Element<V> previous) {
		this.previous = previous;
	}
}
