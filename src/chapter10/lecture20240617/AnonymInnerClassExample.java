package chapter10.lecture20240617;

import java.util.function.Function;
import java.util.function.Predicate;

public class AnonymInnerClassExample {
	
	private int abc;
	
	public AnonymInnerClassExample() {
		int foo = 42;
		
		Runnable bar = new Runnable() {
			public void run() {
				// <- was kann alles genutzt werden?
				//    - attribute der äußeren Klasse
				//    - lokale variablen im scope der erzeugung, aber quasi final (Closure)
				System.out.println(abc);
				System.out.println(foo);
			}
		};
	}
	
	
	public static void main(String[] args) {
		new AnonymInnerClassExample();

		// wäre statisch, kein Bezug zum äußeren Objekt
		Runnable bar = new Runnable() {
			public void run() {
			}
		};
		
	}
}
