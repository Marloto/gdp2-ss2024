package chapter06.lecture20240508;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionExamples {
	public static void main(String[] args) {
		// Array -> Warum sind die nicht so angenehm in der generellen Verwendung?
		// -> sind begrenzt in ihrer Länge!
		
		// Datenstrukturen
		// -> Verkettete Listen (Einfach od. Doppelt)
		// -> Hash Maps (Verkettung od. Überlauf)
		// -> Bäume
		
		// Wie kann effizient bestimmte Aufgaben lösen:
		// -> Hinzufügen / Fill
		// -> Suche in der Struktur / Search
		// -> Sortieren (inplace?)
		// -> Löschen
		// -> Iterieren / For / For-Each
		// -> Ersetzen
		
		// ----
		// Collections in Java
		// ----
		// -> List -> ArrayList / LinkedList
		// -> Set  -> TreeSet / HashSet
		// -> Map  -> TreeMap / HashMap
		// Collections benötigen Generics für die Datentypen die in den Strukturen
		// gespeichert werden
		
//		List<String> list = new ArrayList<String>();
		
		
		Map<String, Integer> example = new HashMap<String, Integer>();
		Map<String, Integer> example2 = new TreeMap<String, Integer>();
		
		
		
	}
}
