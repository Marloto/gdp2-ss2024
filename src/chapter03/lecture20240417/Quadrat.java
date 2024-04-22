package chapter03.lecture20240417;

public class Quadrat extends Rechteck {
	// für verkettung über vererbung gibt es "super"
	// -> muss ebenfalls erster Befehl sein
	// -> entweder this oder super für die Verkettung, nicht beides
	
	public Quadrat() {
		super();
		System.out.println("2");
	}
	
	public Quadrat(double laenge) {
		super(laenge);
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		Quadrat quadrat = new Quadrat(10);
		quadrat.setBreite(42);
		System.out.println(quadrat);
		
		// Zuweisungsmöglichkeiten?
		Quadrat q1 = new Quadrat(10);
		Quadrat q2 = new Quadrat(10);
		
		// Generell ist die Zuweisung
		// auf Variablen der selben
		// oder generellenen Klasse möglich
		// also ein Quadrat auf Quadrat, Rechteck od.
		// Object
		Object obj = q2;
		
		Rechteck r1 = q2;
		
		// Quadrat q3 = obj; <- geht nicht
		
		q1.equals("Hello, World!");
		
		if(obj instanceof Quadrat) {
			System.out.println("ist quadrat");
		}
		if(obj instanceof Rechteck) {
			System.out.println("ist rechteck");
		}
		if(obj instanceof Object) {
			System.out.println("ist object");
		}
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Quadrat) {
			Quadrat q = (Quadrat) obj;
			
			return q.getBreite() == this.getBreite() && q.getLaenge() == this.getLaenge();
			
		}
		return false;
	}
	
	public double flaeche() {
		return super.flaeche();
	}
	
	public void setLaenge(double laenge) {
		super.setLaenge(laenge);
		super.setBreite(laenge);
	}
	
	@Override // <- informiert darüber, wenn die überklasse die methode garnicht anbietet
	public void setBreite(double breite) {
		super.setLaenge(breite);
		super.setBreite(breite);
		
		// Was war this? Referenz auf aufrufendes Objekt
		Quadrat q = this;
		// super ist keine referenz auf ein objekt (wie z.B. this)
		// super ist nur eine Möglichkeit auf explizit auf Eigenschaften
		// der Elternklasse zuzugreifen
		// Quadrat q2 = super; <- sowas geht nicht!
	}
	
	public String toString(String msg) {
		return "...";
	}
	
}
