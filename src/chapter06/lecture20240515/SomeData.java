package chapter06.lecture20240515;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomeData implements Iterable<String>{
	List<String> data = new ArrayList<>();
	public void add(String msg) {
		data.add(msg);
	}
	
	public Iterator<String> iterator() {
		// Einfache Form -> nutzen Sie die iterator-Methode an Iterable-Objekten
		return data.iterator();
		
		// falls man doch was etwas spezielles damit macht, können diese weiter
		// verwendet werden
//		return new SomeDataIterator(data.iterator());
	}
	
	public static void main(String[] args) {
		SomeData someData = new SomeData();
		someData.add("A");
		for(String foo: someData) {
			System.out.println(foo);
		}
	}
}
