package chapter03.lecture20240417;

public class SubQuadrat extends Quadrat {

	// Tip: um aus Zeichenketten primitive Datentypen abzuleiten
	// -> großegeschriebenen Name der Datentypen verwenden
	// -> Integer, Double, Float, Byte, Short, Long
	public SubQuadrat(String laenge) {
		super(Double.valueOf(laenge));
		System.out.println("6");
	}
	public static void main(String[] args) {
		new SubQuadrat("12");
	}
}
