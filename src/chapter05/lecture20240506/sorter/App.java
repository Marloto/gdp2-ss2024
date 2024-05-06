package chapter05.lecture20240506.sorter;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		Quadrat[] q = new Quadrat[] {
                new Quadrat(10),
                new Quadrat(2),
                new Quadrat(4)
        }; 
        Student[] s = new Student[] {
                new Student("a", 10),
                new Student("a", 2),
                new Student("c", 4),
                new Student("b", 4),
                new Student("b", 5)
        };
        // jetzt wird nach Matrikelnummer sortiert, über einen
        // Standard "Sorter", wie könnte dies für Quadrate nach
        // seitenlaenge realisiert werden?
//        Bubblesort.sortiere(s, new MatrikelSorter());
//        Bubblesort.sortiere(s);
        Arrays.sort(s, new MatrikelSorter());
        System.out.println(Arrays.toString(s));
        
//        Bubblesort.sortiere(q, new SeitenlaengerSorter());
//        Bubblesort.sortiere(q);
//        System.out.println(Arrays.toString(q));
	}
}
