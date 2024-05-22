import java.util.Iterator;
import java.util.List;

public class PlayList implements Iterable<AudioFile> {

	private List<AudioFile> list;
	private int current; // <- das muss raus
	
	// Ziel
	// -> Instanz eines Iterator für das Abspielen vorhalten
	// -> Aktuelles Lied, dass durch den Iterator geliefert wird
	
	public AudioFile currentAudioFile() {
		// aktuelle Lied
		// this.list.get(this.current);
		
		return null;
		
	}
	
	public void nextSong() {
		// this.current ++; zzgl. beginnen von vorne
		// umbauen zu:
		// - ggf. iterator erzeugen falls noch keiner existiert
		// - hasNext um zu überprüfen ob mehr da ist
		// - next um das nächste Lied auszulesen und in einem Attribut zu speichern		
	}
	
	// Hinweis: wie wirkt siche die Veränderung von SortCrit. und Suche-String aus?
	// -> Setter anpassen, damit der Iterator / currentAudioFile zurückgesetzt wird
	// -> auch bei loadFromM3U müsste der Zustand der Abspielposition zurückgesetzt werden
	
	public Iterator<AudioFile> iterator() {
		return new ControllablePlayListIterator(null, null, null);
	}
	
	public String toString() {
		return this.list.toString();
	}

}
