package chapter10.lecture20240610.classtypes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

// Variante 2: Eine lokale Klasse, die neben der eigentlichen Klasse definiert wird
class ExampleB {
	
}


//Variant 1: Klasse public und mit Namen der Datei synchron.
public class ExampleA implements Comparable<ExampleA> {
	
	private int foo;
	
	public ExampleA(int foo) {
		this.foo = foo;
	}
	
	// Variante 4: Innere Klasse, kann nicht in einem statischen Kontext verwendet werden (instanziiert werden)
	// -> erhalten einen Bezug zum Objekt in dessen Kontext ExampleC erzeugt wurde
	// -> kann passieren durch: Konstruktor od. Methode (nicht statisch!) von ExampleA
	public class ExampleC {

		public void doMorething() {
			System.out.println(this);
			System.out.println(ExampleA.this);
		}
		
	}
	
	// Variante 5: Statische innere Klasse, keinen Bezug zu einem Objekt von ExampleA
	// -> protected, private, (nix)
	public static class ExampleD {
		
	}
	
	
	
	public void doSomething() {
		// Variante 3: Anonyme innere Klasse, ohne Namen basierend auf Schnittstelle od. Klasse, direkt instanziert
		Comparator<ExampleA> obj = new Comparator<ExampleA>() {
			public int compare(ExampleA o1, ExampleA o2) {
				return 0;
			}
		};
		
		// Variante 3: ebenso anoym und innere Klasse, ohne Name, spezialisiert ExampleA
		Comparable<ExampleA> obj2 = new ExampleA(24) {
			
		};
		
		ExampleC ref = new ExampleC();
		ref.doMorething();
	
	}
	
	public static void main(String[] args) { // <- static
		ExampleA exA = new ExampleA(12);
		ExampleB exB = new ExampleB();
		// new ExampleC(); //geht nicht, weil nur in Objekten von ExampleA möglich (da in ExampleA definiert)
		exA.doSomething();
		ExampleD exD = new ExampleD();
		
		new HashMap();
		new LinkedList();
	}

	@Override
	public int compareTo(ExampleA o) {
		// TODO Auto-generated method stub
		return 0;
	}
}