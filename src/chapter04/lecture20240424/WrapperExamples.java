package chapter04.lecture20240424;

public class WrapperExamples {
	public static void main(String[] args) {
		// für primitive Datentypen gibt es weitere Klassen die diese entsprechen
		// -> int Integer
		// -> long Long
		// -> short Short
		// -> byte Byte
		// -> boolean Boolean
		// -> float Float
		// -> double Double
		// -> char Character
		// Instanzen der Wrapper-Klassen sind Immutable
		// -> wert wird in einem final-Attribut
		
		int zahl1 = 42; // zahl 42 gespeichert
		Integer zahl2 = 42; // objektreferenz von einer Instanz der Klasse Integer, die die Zahl 42 reprä.
		
		int zahl3 = Integer.valueOf(42); // <- standard weg zum Zugriff
		
		Integer zahl4 = new Integer(42); // nicht verwenden
		Integer zahl5 = zahl4;
		Integer zahl6 = Integer.valueOf("129");
		int zahl7 = Integer.parseInt("42");
		
		
		Integer zahl8_1 = Integer.valueOf(1);
		Integer zahl8_2 = Integer.valueOf(1);
		Integer zahl8_3 = Integer.valueOf(128);
		Integer zahl8_4 = Integer.valueOf(128);
		
		// Verwenden Sie kein  == bei Klassen, immer mit Equals!
		if(zahl8_1 == zahl8_2) {
			System.out.println("Gleich!");
		}
		if(zahl8_3 == zahl8_4) {
			System.out.println("Gleich!"); // <- funktioniert nicht!
		}
		
		int zahl9 = zahl6.intValue() + zahl8_1.intValue();
		int zahl10 = zahl6 + zahl8_1; // <- autounboxing
		
		// Autounboxing: wenn man mit Integer-Instanzen arbeitet z.B. in 
		//   Rechenoperationen, werden diese "Entpackt" und mit dem
		//   eigentlichen Wert weitergearbeitet
		
		Integer zahl11 = 42; // autoboxing
		
		// Autoboxing: wenn man ein int auf eine Integer-Variable zuweist
		//   wird diese automatisch verpackt
		
		
		// Speicherbedarf hoehr (gleich)
		int zahl12 = 42; // <- 32 bit, 4 byte
		Integer zahl13 = 42; // <- "128 bit"? 32 bit für Zahl, zzgl. Objekt-Daten

		// -> zwingend notwendig sind Wrapper-Instanzen im Umgang mit 
		//    Datenstrukturen wie Map, List, Set
		
	}
}







