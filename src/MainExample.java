
public class MainExample {
	public static void main(String[] args) {

		// Objekterzeugung: new Konto()
		
		// Objekterzeugung und zuweisung auf eine Variable:
		// <Klassenname> <name> = new <Klassenname>();
		Konto foo = new Konto("1234", 9876);
		Konto bar = new Konto();
		
		// <variablenname>.<attribut>
		foo.nr = "1234";
		foo.pin = 9876;
		// <variablenname>.<methode>()
		foo.einzahlen(100);
		
		// syso + crtl + leertaste
		System.out.println(foo.print());
		
		// Frage wie das Konto in bar füllen mit Informationen?
		bar.nr = "xyz";
		bar.einzahlen(42);
		bar.auszahlen(2);
		System.out.println(bar.print());
		
		Account someAcc1 = new Account();
	}
}
