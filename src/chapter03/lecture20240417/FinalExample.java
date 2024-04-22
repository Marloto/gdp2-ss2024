package chapter03.lecture20240417;

public class FinalExample {
	
	public final int bar; // < attribut nicht änderbar
	public static final int abc; // < attribut nicht änderbar
	// wird initialisiert sobald die Klasse erstmal aufgerufen wird
	
	// ggf. sowas noch denkbar, aber zuweisung an attribut reicht völlig
	static {
		abc = 321;
	}
	
	public FinalExample() {
		bar = 123;
	}
	
	// final steuert hier, dass eine methode nicht mehr überschrieben werden kann
	// -> überladen geht weiterhin
	public final void doSomething() {
		
	}
	
	// Parameter nur über Argument belegbar
	public final void doOtherthing(final int stuff) {
		
	}
	
	public static void main(String[] args) {
		final int foo;
		foo = 42;
		// foo = 43; <- lässt sich nicht ändern
		
		String path = "a/v/c";
		String[] split = path.split("/");
		
	}
}
