package chapter05.lecture20240506.sorter;

public class Student implements Sorter2, Comparable {
    private String name;
    private int matrikelnummer;

	public boolean check(Object o1) {
		if(!(o1 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Student s1 = (Student) o1;
		return this.getMatrikelnummer() > s1.getMatrikelnummer();
	}

	public int compareTo(Object o1) {
		if(!(o1 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		
		
		Student s1 = (Student) o1;
		
//		return this.matrikelnummer - s1.matrikelnummer;
		
		String n1 = this.getName();
		String n2 = s1.getName();
		int compareTo = n1.compareTo(n2);
		
		if(compareTo == 0) {			
			Integer m1 = this.getMatrikelnummer();
			Integer m2 = s1.getMatrikelnummer();
			int compareTo2 = m1.compareTo(m2);
			// bei weiteren sortierkriterien
//			if(compareTo2 == 0) {
//				// ...
//			}
			return compareTo2;
		}
		return compareTo;
		
		
		
		// Vergleich mit this
//		if(this.getMatrikelnummer() > s1.getMatrikelnummer()) {
//			return 1; // this > o1 dann positiv
//		} else if(this.getMatrikelnummer() > s1.getMatrikelnummer()) {
//			return -1; // this < o1 dann negativ
//		}
//		return 0;
	}

    public Student(String name, int matrikelnummer) {
        super();
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getValue() {
        return this.matrikelnummer;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", matrikelnummer=" + matrikelnummer + "]";
    }

}
