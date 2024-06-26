package chapter11.lecture20240626;

public class ThreadTest3 extends Thread {
	private int i;

	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		new ThreadTest3().start();
		new ThreadTest3().start();
	}
}