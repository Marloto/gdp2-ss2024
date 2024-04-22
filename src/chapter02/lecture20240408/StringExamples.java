package chapter02.lecture20240408;

public class StringExamples {
	public static void main(String[] args) {
		// Kein primitiver Datentyp, es wird als Objekt verwendet
		// es werden Referenzen gespeichert, was bei primitiven
		// Datentypen so nicht wäre
		String example = "abc";
		String string1 = "ab";
		String string2 = "c";
		String foo = string1 + string2;
		if(foo == example) {
			System.out.println("gleich?!");
		}
		
		// String sind Immutable
		// new String()
		// -> this.value = "".value;
		// -> Man versucht immer das selbe leere byte-Array zu nutzen
		// -> this.value = new byte[0];
		
		String original = "abcdefb  "; // <- erste
		String example2 = new String(original); // 2 Objekte, new String und 
		// Kopie eines anderen Strings
		// in C mit String-Copy, sizeof für die Länge
		// in Java gibt es Methoden an dem String-Objekt
		int length = original.length();
		
		String res = "";
		for(int i = 0; i < length; i ++) {
			char c = original.charAt(i);
			// -> / od. \, vorsicht bei \ ist ein Sonderzeichen, 
			//    Escape-Symbol, meist folgt ein n, r, t, ", '
			//    Für den echten Back-Slash \\
			
			// byte -> 8bit -> 2^8 -> 256 od. -128 bis 127
			// -> UTF-8 nutzt ein Steuer byte und deutet damit an
			//    das ein weiteres byte dazugehört
			
			// Wie kann man fragen, ob ein character ein Kleinbuchstabe ist
			// -> methode in Strings
			if(c >= 'a' && c <= 'z') {
				System.out.println("kleinbuchstabe");
			}
			
			if(c == 'b') {
				res += 'x';
			} else {
				res += c;
			}
			
		}
		// res "a", "ax", "axc", "axcd", "axcde", "axcdef"
		System.out.println(res);
		System.out.println(original.replace('b', 'x')); // <- character ersetzen
		System.out.println(original.replace("b", "x")); // <- mit string ebenfalls möglich
		// replace für einfache Ersetzung, replaceAll für Ersetzen + Reguläre Ausdrücke 
		// (aktuell nicht verwenden)
		
		// Suchen
		int indexOf = original.indexOf("b");
		int lastIndexOf = original.lastIndexOf("b");
		System.out.println(indexOf);
		System.out.println(lastIndexOf);
		
		boolean contains = original.contains("bc");
		boolean startsWith = original.startsWith("ab");
		System.out.println(original.substring(indexOf + 1));
		System.out.println(original.substring(2, 4));
		
		// trim()
		// -> entfernt whitespaces (leerzeichen, tabs und umbrüche)
		System.out.println(original.trim());
		
		// wie aufrufe verketten, bzw. weiterverwenden wenn Strings immutable sind?
		String res2 = original.replace("b", "x").trim();
		System.out.println(res2);
		
		Rechteck rechteck = new Rechteck(10);
		String toString = rechteck.toString();
		System.out.println(toString);
	}
}








