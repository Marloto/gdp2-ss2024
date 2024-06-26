package chapter11.lecture20240624;

public class ThreadExample2 {
	public static void main(String[] args) {
		// Call-Stack: welche Methoden wurden aufgerufen bis zu einer bestimmten
		// Anweisung.
		Example task = new Example();
		
		new Thread(task).start();
		doSomething();
	}
	
	static class Example implements Runnable {
		public void run() {
			doSomething();
		}
	}
	
	private static int arr = 0;

	private static void doSomething() {
		System.out.println("Hello, World! Ich bin: " + Thread.currentThread().getName());
		arr = arr + 1;
	}
}
