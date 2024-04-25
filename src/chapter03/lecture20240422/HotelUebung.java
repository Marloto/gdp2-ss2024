package chapter03.lecture20240422;

class Unterkunft {
	protected Adresse adresse;
	protected Zimmer[] zimmer;
	protected String name;

	// Konstruktor zur initialisierung?
	public Unterkunft(Adresse adresse, String name, Zimmer[] zimmer) {
		this.adresse = adresse;
		this.name = name;
		this.zimmer = zimmer;
	}
	
	@Override
	public String toString() {
		return name + " - " + adresse;
	}
}

class Hotel extends Unterkunft {
	protected Restaurant rest;
	protected final int sterne;

	// aktuell nur default-konstruktor, super klasse hat keinen default, daher muss
	// dies explizit implementiert werden
	public Hotel(Adresse adresse, String name) {
		this(adresse, name, 1);
	}

	public Hotel(Adresse adresse, String name, int sterne) {
		super(adresse, name, new Zimmer[0]);
		this.sterne = sterne;
	}

	public int getSterne() {
		return sterne;
	}
	
	public String toString() {
		return super.toString() + " (" + sterne + ")";
	}
}

class Motel extends Unterkunft {
	public Motel(Adresse adresse) {
		super(adresse, null, null);
	}
}

class Adresse {
	private String strasse;
	private String plz;
	private String city;

	public Adresse(String strasse, String plz, String city) {
		this.strasse = strasse;
		this.plz = plz;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getPlz() {
		return plz;
	}

	public String getStrasse() {
		return strasse;
	}
}

class Zimmer {

}

class Restaurant {

}

public class HotelUebung {

}
