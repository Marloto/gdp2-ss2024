package chapter05.lecture20240506.sorter;

import java.util.Comparator;

public class MatrikelSorter implements Sorter, Comparator {
	public boolean check(Object o1, Object o2) {
		// Wir wollen mit Studenten arbeiten, 
		// wie könnte ein erster Schritt aussehen?
		if(!(o1 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		if(!(o2 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.getMatrikelnummer() > s2.getMatrikelnummer();
	}

	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		if(!(o2 instanceof Student)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.getMatrikelnummer() - s2.getMatrikelnummer();
	}

}
