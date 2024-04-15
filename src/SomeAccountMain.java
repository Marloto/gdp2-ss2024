import something.sub.SomeAccount; // mit der Anweisung gilt 
// der Klassenname in Kurzform, also SomeAccount

// import otherthing.SomeAccount;
import java.util.Scanner;
import static java.lang.System.*;

public class SomeAccountMain {
	public static void main(String[] args) {
		SomeAccount a1 = new SomeAccount();
		
		otherthing.SomeAccount a2 = new otherthing.SomeAccount();
		
		// Was ist das?! Package: java.util
		// System ist für Eingaben, ist System ein Package?
		// -> methode, keine Klasse
		// -> statisches Attribut (InputStream)
		Scanner scanner = new Scanner(in);
		
		
	}
}
