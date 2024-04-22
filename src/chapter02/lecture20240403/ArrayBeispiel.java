package chapter02.lecture20240403;
import java.util.Scanner;

public class ArrayBeispiel {
	public static void main(String[] args) {
		// In C z.B. für Strings über Character-Array
		// Für mehrere Daten
		// Irgendwann die Größe angeben
		// Deklariert wird ... nur das es ein Array ist
		// Die Größe wird bei Erzeugung eines Arrays angegeben, z.B. new int[2]
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[scanner.nextInt()]; // min. 0
		
		// Zugriff über Index in den Klammern
		// 0 ... index - 1
//		arr[0] = 42;
//		arr[1] = 21;
//		arr[2] = 1;
		
		// Anzahl über \0 zeichen in Strings (in C)
		// in C wäre noch sizeof
		// In Java erhalten Sie alle Informationen zu ihren Array über die Referenz
		// -> arr.length
		
		int[] arr2 = arr;
		
		// Wie das Array mit 1'en füllen?
		for(int i = 0; i < arr2.length; i ++) {
			arr[i] = 1;
		}
		
		for(int i = 0; i < arr2.length; i ++) {
			System.out.println(arr[i]);
		}
		
		// Mögliche Datentypen?
		// Alles... primitive Datentypen, eigene Klassen, usw.
		Rechteck[] rechtecke = new Rechteck[3];
		rechtecke[0] = new Rechteck(42);
		rechtecke[1] = new Rechteck(21);
		rechtecke[2] = rechtecke[1];
		
		// Erzeugt ein Array der Länge 3, 0 -> 3, 1 -> 2, 2 -> 1
		int[] arr3 = new int[] {3, 2, 1};
		
		// For-Each als Vereinfachung um über jedes Element einer Menge zu iterieren
		for(int element : arr3) {
			element = 42;
		}
		// Keine Zuweisung möglich, bei primitiven Datentypen damit nur Verarbeitung
		// -> bei Objekten?
		for(Rechteck el : rechtecke) {
			System.out.println(el.breite);
		}
		
		// Inline-Initialisierung bei Klasse Rechteck?
		Rechteck[] rechtecke2 = new Rechteck[] {
				new Rechteck(10),
				new Rechteck(10),
				new Rechteck(10)
		};
		
		// Mehrdimensionale Arrays?!
		// z.B. eine 2D Matrix
//		int[][] matr = new int[][] {
//			new int[4],
//			new int[4],
//			new int[4]
//		};
		
		int[][] matr = new int[3][];
		matr[0] = new int[4];
		matr[1] = new int[6];
		matr[1] = new int[10];
		
		int arr4[]; // ist ebenso möglich
		
		
		String string = "";
		
		
		
		
		
		
		
		
	}
}
