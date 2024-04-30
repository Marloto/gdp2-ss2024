package chapter05.lecture20240430.observe;

// soll nachrichten gefiltert ausgeben
// -> filter wird als Array übergeben
public class BadWordsFilter extends ChangeLogger {
	private String[] filter;
	public BadWordsFilter(String[] filter) {
		this.filter = filter;
	}
	
	public void dataChanged(String value) {
		// contains zum prüfen
		for(String el : filter) {
			if(value.contains(el)) {
				return;
			}
		}
		//System.out.println("[BadWordsFilter] New data: " + value);
		super.dataChanged(value);
	}
}


