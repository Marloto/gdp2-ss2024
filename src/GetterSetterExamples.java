
public class GetterSetterExamples {
	public static void main(String[] args) {
		// Getter / Setter realisieren 
		// Kapselung
		// -> Kontrollierter Zugriff auf Att.
		// -> Getter auslesen
		//    private <Datentyp> <attributname>;
		//    <Datentyp> get<Attributname>() {
		//       return this.<attributname>
		//    }
		//    Ausnahme: Boolean-Typ -> get zu is
		// -> Setter zum Ändern
		//    private <Datentyp> <attributname>;
		//    public void set<Attributname>(<Datentyp> value) {
		//        this.<attributname> = value;
		//    }
		
		Rechteck r = new Rechteck();
		r.setBreite(10);
		r.setLaenge(10);
		
		System.out.println(r.getLaenge());
		System.out.println(r.getBreite());
		
		Rechteck r2 = new Rechteck()
				.setBreite(10)
				.setLaenge(42);
	}
}
