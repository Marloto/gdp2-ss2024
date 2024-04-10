import java.util.Objects;

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

	public double getLaenge() {
		return laenge;
	}

	public double getBreite() {
		return breite;
	}
	
	public Rechteck setLaenge(double laenge) {
		this.laenge = laenge;
		return this;
	}
	
	public Rechteck setBreite(double breite) {
		this.breite = breite;
		return this;
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
	
//	public String toString() {
//		return "Rechteck [laenge=" + laenge + ", breite=" + breite + "]";
//	}
//	
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Rechteck other = (Rechteck) obj;
//		return Double.doubleToLongBits(breite) == Double.doubleToLongBits(other.breite)
//				&& Double.doubleToLongBits(laenge) == Double.doubleToLongBits(other.laenge);
//	}
	
	

	public String toString() {
		return "Rechteck " + this.breite + "/" + 
			this.laenge;
	}
	
	public boolean equals(Object obj) {
		// eine Zeile erst einmal so wie sie ist übernehmen
		Rechteck r = (Rechteck) obj;
		
		return this.breite == r.breite && this.laenge == r.laenge;
	}
	
	
}








