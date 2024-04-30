package chapter05.lecture20240430.observe;

public class Sender {
	private String data;
	private IReceiver[] receivers = new IReceiver[10]; 

	public void attach(IReceiver receiver) {
		for (int i = 0; i < receivers.length; ++i) {
            if (receivers[i] == null) {
                receivers[i] = receiver;
                break;
            }
        }
	}

	public void setData(String newData) {
        this.data = newData;
        // wann immer daten verändert werden,
        // sollen diese mit "ChangeLogger" ausgegeben
        // und mit "MessageCounter" gezählt werden
        for (int i = 0; i < receivers.length; ++i) {
            if (receivers[i] != null) {
            	receivers[i].dataChanged(newData);
            }
        }
    }
	
	// Problem, für die Einführung von BadWordsFilter
	// müsste der Konstruktor, die setData und die Attribut-
	// List angepasst werden -> schlecht bzgl. Veränderung
	
	
	
	
}
