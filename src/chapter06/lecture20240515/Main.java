package chapter06.lecture20240515;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
//		SimpleLinkedList<String> foo = new SimpleLinkedList<>();
//		foo.add("A");
//		foo.add("B");
//		foo.add("C");
//		foo.remove("B");
//		
//		// Iterable -> eine Klasse soll iterierbar sein
//		// Iterator -> wie man durch eine Menge iteriert
//		Iterable<String> something = foo;
//		for(String cur : foo) {
//			System.out.println(cur);
//		}
//		
//		Iterator<String> iterator = foo.iterator();
//		while(iterator.hasNext()) {
//			String cur = iterator.next();
//			// ...
//		}
//		
//		
////		int[] arr = new int[] {1,2,3};
////		int i = 0;
////		while(i < arr.length) {
////			int cur = arr[i ++];
////		}
////		
////		for(i = 0; i  <arr.length; i ++) {
////			int cur = arr[i];
////		}
//		
//		
//		SimpleLinkedList<Integer> bar = new SimpleLinkedList<>();
//		bar.add(1);
//		bar.add(2);
//		bar.add(3);
//		
//		
//		
//		// Iteration von 1 bis 10
//		for(int j = 1; j <= 10; j += 2) {
//			System.out.println(j);
//		}
//		// Was muss gemacht werden, damit die Iteration über
//		// diese Klasse funktioniert (von 1 bis 10, wie im 
//		// Beispiel davor)
//		for(int j : new Range(1, 10, 3)) {
//			System.out.println(j);
//		}
		
		Range range = new Range(1, 10, 2);
		
		Iterator<Integer> it = range.iterator();
		Iterator<Integer> it2 = range.iterator();
		while(it.hasNext()) {
			int cur = it.next();
			System.out.println(cur);
		}
		while(it2.hasNext()) {
			int cur = it2.next();
			System.out.println(cur);
		}
	}
}
