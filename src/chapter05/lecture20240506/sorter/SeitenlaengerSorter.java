package chapter05.lecture20240506.sorter;

import java.util.Comparator;

public class SeitenlaengerSorter implements Sorter, Comparator {

	@Override
	public boolean check(Object o1, Object o2) {
		if(!(o1 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		if(!(o2 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Quadrat q1 = (Quadrat) o1;
		Quadrat q2 = (Quadrat) o2;
		return q1.getSeitenlaenge() > q2.getSeitenlaenge();
	}

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		if(!(o2 instanceof Quadrat)) {
			throw new RuntimeException("Ungültiger Wert!");
		}
		Quadrat q1 = (Quadrat) o1;
		Quadrat q2 = (Quadrat) o2;
		Integer s1 = q1.flaeche();
		Integer s2 = q2.flaeche();
		return s1 - s2;
	}

}
