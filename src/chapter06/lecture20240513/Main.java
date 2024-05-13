package chapter06.lecture20240513;

public class Main {
	public static void main(String[] args) {
		SimpleLinkedList<String> foo = new SimpleLinkedList<>();
		foo.add("A");
		foo.add("B");
		foo.add("C");
		foo.remove("B");
		
		SimpleLinkedList<Integer> bar = new SimpleLinkedList<>();
		bar.add(1);
		bar.add(2);
		bar.add(3);
	}
}
