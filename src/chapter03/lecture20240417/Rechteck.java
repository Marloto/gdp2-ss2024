package chapter03.lecture20240417;

public class Rechteck {
	// this für Verkettung
	// -> z.B. Rechteck ein Konstruktor für zwei Parameter
	// -> mit einem weiteren Konstruktor könnte man einen weiteren Konstruktor ergänzen
	// -> this als Verkettung
	
	private double laenge;
	private double breite;
	
	public Rechteck() {
		System.out.println("3");
	}

	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
		System.out.println("4");
	}

	public Rechteck(double laenge) {
		this(laenge, laenge);
		System.out.println("5");
	}
	
	public void setBreite(double breite) {
		this.breite = breite;
	}
	
	public double getBreite() {
		return breite;
	}
	
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public double flaeche() {
		return laenge * breite;
	}

	public String toString() {
		return "Rechteck [laenge=" + laenge + ", breite=" + breite + "]";
	}
	
	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck();
		if(rechteck.equals(rechteck)) {
			
		}
		
		String string = rechteck.toString();
	}
	
}
