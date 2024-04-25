package chapter04.lecture20240424;

public class Termin {
	// Konstanten als Ansatz
	// -> Problem 1: durch implementierungsfehler könnten zwei typen die selbe Zahl verwenden
	// -> Problem 2: der Konstruktor müsste prüfen, ob der Wertebereich auch korrekt genutzt
	public static final int UNDEFINIERT = 0;
	public static final int ONLINE_MEETING = 1;
	public static final int TELEFON_GESPRAECH = 2;
	public static final int CHAT_SITZUNG = 3;
	public static final int PRAESENZ_MEETING = 4;
	
	private String name;
	
//	private int type;
	// <- 0 = undefiniert
	// <- 1 = online meeting
	// <- 2 = telefon gespraech
	private TerminTyp type;
	
	public Termin(String name, TerminTyp type) {
		this.name = name;
		this.type = type;
	}
	
	public boolean isTelefonGespraech() {
		return this.type == TerminTyp.TELEFON_GESPRAECH;
	}
	
	public static void main(String[] args) {
		Termin termin = new Termin("Heute, viel zu tun", TerminTyp.TELEFON_GESPRAECH);
		
		TerminTyp ref = TerminTyp.TELEFON_GESPRAECH;
		TerminTyp ref2 = ref; // zuweisung möglich, ist ref.
		//TerminTyp ref3 = new TerminTyp(); <- keine neuen Objekt möglich
		
		if(termin.isTelefonGespraech()) {
			System.out.println("Ist ein Telefongespräch!");
		}
		
		// Liefert eine Zahl beginnend bei 0
		System.out.println(termin.type.ordinal());
		// Liefert den Namen des Enums
		System.out.println(termin.type.name());
		// Alle Enum-Typen erben von "Enum", nicht direkt Object
		System.out.println(termin.type instanceof Enum);
		TerminTyp[] values = TerminTyp.values();
		
		// aus konsole oder gui
		String eingabe = "UNDEFINIERT";
		//TerminTyp typ = ???; // umwandeln von Zeichenketten in Enum-Objekt ggf. über name und values()
		TerminTyp typ = TerminTyp.valueOf(eingabe);
		// Falls nicht existiert, kommt eine Exception
		System.out.println(typ.toString());
		
		// Beliebige Methoden möglich, können normal aufgerufen werden
		long dauerInMin = typ.getDauerInMin();
		
		// Anstatt == geht auch equals
		TerminTyp.UNDEFINIERT.equals(typ);
	}
}








