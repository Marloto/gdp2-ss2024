package chapter11.lecture20240626;

public class JoinExample {
	private static Object obj = new Object();
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			doSomething();
		}).start();
		
		synchronized (obj) { // Main-Thread geht direkt in diesen Block, da er schneller ist als der neue Thread startet
			System.out.println("Main-Methode ist in Sync, wartet darauf das der Thread ist fertig ist");
			obj.wait(); // Gibt den sync frei, blockiert aber an der stelle bis irgendwer "notify" am selben Objekt aufruft
			System.out.println("Thread ist fertig...");
		}
	}




	private static void doSomething() {
		synchronized (obj) {
			System.out.println("doSomething-Methode ist in Sync");
			obj.notify(); // informiert alle wartenden, dass sie weiter machen können
		}
	}
}
