package chapter04.lecture20240424;

// (wie war es in C?)
public enum TerminTyp {
	UNDEFINIERT(0), ONLINE_MEETING(15), TELEFON_GESPRAECH(10), CHAT_SITZUNG(5), PRAESENZ_MEETING(30), HYBRIDE_MEETING(20);
	
	
	// Ab hier beginnen die Klassen-Eigenschaften
	private final long dauerInMin;
	
	private TerminTyp(long dauerInMin) {
		this.dauerInMin = dauerInMin;
	}
	
	public long getDauerInMin() {
		return dauerInMin;
	}
	
}
