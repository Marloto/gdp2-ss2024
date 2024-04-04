
class Rechteck {
	double laenge;
	double breite;

	Rechteck(double l, double b) {
		laenge = l;
		breite = b;
	}
	Rechteck(double l) {
		this(l, l); // muss 1. anweisung
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
