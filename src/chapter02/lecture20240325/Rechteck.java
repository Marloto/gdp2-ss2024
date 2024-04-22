package chapter02.lecture20240325;

public class Rechteck {
	double laenge;
	double breite;

	public Rechteck(double l, double b) {
		laenge = l;
		breite = b;
	}
	public Rechteck(double l) {
		this(l, l); // muss 1. anweisung
	}
	public Rechteck() {
		
	}
	
	double flaeche() {
		return laenge * breite;
	}
	
	void update(double l, double b) {
		laenge = l;
		breite = b;
	}
	
	void update(int l, int b) {
		laenge = l;
		breite = b;
	}
	
	
	
	void update(int l) {
		double foo = l;
		update(foo, foo);
	}
	
	void update2(int l) {
		double foo = l;
		update(foo, foo);
	}
	
	void someExample(int zahl, boolean someFlag) {
		
	}
	
	void someExample(int zahl) {
		someExample(zahl, true);
	}
	
	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck(10, 10);
		int example = 42;
		// Aufruf von double,double
		rechteck.update(
				example / 10.0, 
				example / 10.0
		);
		// Aufruf von int,int
		rechteck.update(
				example / 10, 
				example / 10
		);
	}
	
	
}








