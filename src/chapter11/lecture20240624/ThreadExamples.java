package chapter11.lecture20240624;

public class ThreadExamples {
	public static void main(String[] args) {
		// Call-Stack: welche Methoden wurden aufgerufen bis zu einer bestimmten
		// Anweisung.
		while(true) {
			ExampleThread exampleThread = new ExampleThread();
//			exampleThread.setDaemon(true);
			exampleThread.start();
		}
//		doSomething();
	}
	
	static class ExampleThread extends Thread {
		public void run() {
			doSomething();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static int arr = 0;

	private static void doSomething() {
		System.out.println("Hello, World!");
		arr = arr + 1;
	}
}
