package chapter05.lecture20240506.sorter;

public class Quadrat implements Sorter2, Comparable {
    private int seitenlaenge;

    public Quadrat(int seitenlaenge) {
        super();
        this.seitenlaenge = seitenlaenge;
    }
   
    // Natürliche Reihenfolge nach seitenlaenge
    // Comparator nach flächeninhalt

	public boolean check(Object o1) {
		if(!(o1 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Quadrat s1 = (Quadrat) o1;
		return this.getSeitenlaenge() > s1.getSeitenlaenge();
	}
	public int compareTo(Object o1) {
		if(!(o1 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Quadrat q1 = (Quadrat) o1;
		Integer s1 = this.getSeitenlaenge();
		Integer s2 = q1.getSeitenlaenge();
		return s1.compareTo(s2);
	}
	
	public int flaeche() {
		return seitenlaenge * seitenlaenge;
	}


    public int getSeitenlaenge() {
        return seitenlaenge;
    }
    
    public int getValue() {
        return seitenlaenge;
    }

    @Override
    public String toString() {
        return "Quadrat [seitenlaenge=" + seitenlaenge + "]";
    }
    
}