package chapter02.lecture20240408;

public class ExampleEquals {
	public static void main(String[] args) {
		Rechteck r1 = new Rechteck(10);
		Rechteck r2 = new Rechteck(10);
		if(r1 == r2) { // ob hier die selben referenzen in den 
			// Variablen sind, und nicht ob der inhalt gleich ist
			System.out.println("Gleich!");
		}
		
		// Equals -> vergleicht zwei Objekte, das aktuelle
		// mit dem übergebenen
		boolean identisch = r1.equals(r2);
		System.out.println("Ist gleich? " + identisch);
		
		if(r1.equals(r2)) {
			System.out.println("Gleich!");
		}
		
		String res = r1.toString(); // "Rechteck mit 10 / 10", "Rechteck[10/10]"...
		System.out.println(res);
		
		Account a1 = new Account("test@example.net");
		Account a2 = new Account("test@example.net");
		if(a1 == a2) {
			System.out.println("Gleich Acc. (1)");
		}
		if(a1.equals(a2)) {
			System.out.println("Gleich Acc. (2)");
		}
	}
}
