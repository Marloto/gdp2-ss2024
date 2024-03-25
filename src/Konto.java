class Konto {
	// UML-Attribute: [+, -, #, ~] <name> [ : <datentyp> ] [ = <default-wert> ]
	// Java: [public, private, protected, <nix>] <datentyp> <name> [= <default-wert>]
	String nr;
	int pin;
	double kontostand;

	// Konstruktor mit Parametern
	Konto(String nummer, int firstPin) {
		nr = nummer;
		kontostand = 0;
		pin = firstPin;
		System.out.println("Ausgabe a");
	}
	
	Konto(String nummer) { 
		// verknüpfung zw. konstruktoren
		this(nummer, 9876);
		System.out.println("Ausgabe b");
	}
	
	// Default-Konstruktor: keine Parameter
	Konto() {
		this("", 9876);
		System.out.println("Ausgabe c");
	}
	
	// Jeder Konstruktor muss eine andere Parameterliste haben
	
	// UML-Methoden: [+, -, #, ~] <name> ([parameterliste]) [: <rückgabe-datentyp>]
	// -> static wird unterstrichen
	// Java: [public, private, protected, <nix>] [...] <rueckgabe-datentyp od. void> <name> (<parameterliste>) { ... }
	// -> Parameterliste je Element: <datentyp> <name>, ...
	
	void einzahlen(double wert) {
		kontostand += wert;
	}
	void auszahlen(double wert) {
		kontostand -= wert;
	}
	String print() {
		return nr + "=" + kontostand;
	}
	
	// main + crtl + leertaste
	public static void main(String[] args) {}
}