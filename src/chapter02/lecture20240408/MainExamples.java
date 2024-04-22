package chapter02.lecture20240408;

public class MainExamples {
	private static int counter;
	private int counter2;
	
	public MainExamples() {
		counter ++;
	}
	
	public void doSomething() {
		counter2 ++;
	}
	
	public int wertVonCounter() {
		return counter;
	}
	public int wertVonCounter2() {
		return counter2;
	}
	
	public static int calc(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// Statics werden über den Klassennamen aufgerufen
		// und nicht über Objekt-Referenzen
		ExampleEquals.main(args);
		
		System.out.println(MainExamples.calc(1, 2));
		
		MainExamples m1 = new MainExamples();
		m1.doSomething();
		MainExamples m2 = new MainExamples();
		m2.doSomething();
		
		System.out.println(m1.wertVonCounter()); // 2
		System.out.println(m2.wertVonCounter()); // 2
		
		System.out.println(m1.wertVonCounter2()); // 1
		System.out.println(m2.wertVonCounter2()); // 1
		
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}
}

