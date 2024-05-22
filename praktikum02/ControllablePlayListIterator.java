import java.util.Iterator;
import java.util.List;

//                                        implements Iterator<T> {
//                                          -> Bezieht sich auf einen generischen Parameter der in dieser Klasse existiert
//                                        implements Iterator<AudioFile> {
//                                          -> Bezieht sich auf die Klasse AudioFile
public class ControllablePlayListIterator implements Iterator<AudioFile> {

	private List<AudioFile> files;
	private int current;
	private SortCriterion crit;
	private String suche;

	public ControllablePlayListIterator(List<AudioFile> files) {
		this.files = files;
		this.current = 0;
	}
	
	public ControllablePlayListIterator(List<AudioFile> files, String suche, SortCriterion crit) {
		this.suche = suche;
		this.crit = crit;
		// filtern und anpassen der files
		// -> iteration über files und nur ergebnisse die "suche" entsprechen
		//    verwenden
		// -> anschließend je nachdem was SortCriterion ist, den passenden
		//    Comparator verwenden
		// abschließend muss this.files = neue Liste aus Suche / Sortierung
	}
	
	public boolean hasNext() {
		return this.current < files.size();
	}

	public AudioFile next() {
		return files.get(current ++);
	}
	
	public AudioFile jumpToAudioFile(AudioFile file) {
		// Prüfen ob file in files existiert
		// Current modifizieren auf die Position in der Liste
		// Current anpassen, so dass der nächste Aufruf von next dann das lied nach
		// file liefert
		return file;
	}

}
