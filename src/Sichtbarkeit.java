
public class Sichtbarkeit {
	// Sichtbarkeiten in Java
	// -> private, public, protected, und package
	// -> public: alles sichtbar (+)
	// -> private: eigenschaften sind nicht von anderen Klassen sichtbar (-)
	// -> package: innerhalb des Packages (ohne Schlüsselwort, ~)
	// -> protected: innerhalb der Vererbungsstruktur, und Package (#)
	
	// In der Regel: Attribute Privat, keinen Zugriff außerhalb der Klasse erlauben, ggf. protected
	// -> manche Sprachen bieten "Properties"
	
	public static void main(String[] args) {
		Zusatzklasse zusatzklasse = new Zusatzklasse();
		
		// Je nach Sichtbarkeit ist change und foo verfügbar
		zusatzklasse.change(42);
		//zusatzklasse.foo = 42; <- geht nicht weil privat 
	}
}
