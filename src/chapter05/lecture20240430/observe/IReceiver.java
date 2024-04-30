package chapter05.lecture20240430.observe;

public interface IReceiver {
	void dataChanged(String value);
	// was darf man hier, sobald class -> interface?
	// man darf Methoden ohne Körper definieren
	// keine Attribute, aber Konstanten
	// keine Konstruktoren
	// Sichtbarkeit alle Public
}
