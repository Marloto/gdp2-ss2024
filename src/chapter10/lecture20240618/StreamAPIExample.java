package chapter10.lecture20240618;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David", "Edward", "Frank", "George", "Helen");

        // Alle Namen die mit D anfangen ausgeben
        for(String name : names) {
//        	if(name.charAt(0) == 'D' ) {
    		if(name.startsWith("D")) {
        		System.out.println(name);
        	}
        }
        
        System.out.println("---");
        
        Stream<String> stream = names.stream(); // <- Stream
        stream
        	.filter((name) -> name.startsWith("D")) // <- Operator, in diesem Fall muss hier beschrieben werden, 
        	                                        // wie ein element "geprüft wird"
        	.forEach((name) -> System.out.println(name)); // Abschluss / Terminal -> am Ende die Elemente verarbeiten
        
        List<String> list = names.stream() // <- Stream
        		.filter(el -> el.contains("a")) // <- Operator
        		.toList(); // <- Terminal
        
        Stream<String> stream1 = names.stream();
		Stream<String> stream2 = stream1.filter(el -> el.contains("a")); // Operatoren liefern etwas das auf Stream Substituierbar ist
		Stream<String> stream3 = stream2.filter(el -> el.contains("a"));
		stream3.toList(); // <- Terminal, liefert spezielle ergebnisse od nichts
		
		long count = names.stream().filter((name) -> name.startsWith("D")).count();
		
		names.stream().map(name -> name.length()).forEach((value) -> System.out.println(value));
		names.stream()
			.filter(el -> el.contains("a"))
			.map(name -> name.toUpperCase())
			.forEach((value) -> System.out.println(value));
		
		
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 4);
		
		System.out.println("---");
		Integer reduce = list2.stream().reduce(0, (sum, cur) -> { // <- sum ist der aktuelle stand der summe, cur das element
																  //    in der liste
			System.out.println(sum + ", " + cur);
			return sum + cur;
		});
		System.out.println(reduce);
		
		// Collect
		System.out.println("---");
		Set<Integer> collect = list2.stream().collect(Collectors.toSet());
		System.out.println(collect);
        
        // Was ist ein "Functional Interface" (war für Lambdas wichtig)
        // -> "Ein Funktional Interface in Java ist ein Interface, das genau eine Methode enthält"
        // -> Typische Schnittstellen in Java mit einer Methode?
        // -> Runnable { void run(); }
        // -> Consumer<T> { void accept(T t); }
        // -> Predicate<T> { boolean test(T t); }
        // -> Function<T, R> { R apply(T t); }
        // -> Comparator<T> { int compare(T o1, T o2); }
        // -> Comparable<T> { int compareTo(T o); }
	}
}
