// Klassen müssen in dem selben Ordner liegen wie mit package angegeben
package something.sub;

// Konvention für Packages: Rückwärts Domains
// Deutschland > THI > Fak I -> Grundlagen Prog 2
// gdp2.faki.thi.de
// -> package de.thi.faki.gdp2
// -> damit entsprechend in Ordnern: de/thi/faki/gdp2

// "va06", "MediaPlayer_VA06" -> aktuell entfernen da nicht notwendig
// -> keine Packages, da damit der Name verändert wird und die Tests
//    auf "AudioFile" reagieren

// Mit Einführung des Packages ändert sich der Name von SomeAccount zu something.SomeAccount
public class SomeAccount {
	private String id;
	
	public SomeAccount() {
	}
}
