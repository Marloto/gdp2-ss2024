package chapter11.lecture20240626;

public class ThreadTest2 {
	private static int i;

	public static void main(String args[]) {
		Runnable r = () -> {
			for (i = 0; i < 100; i++) {
				System.out.println(i);
			}
		};
		new Thread(r).start();
		new Thread(r).start();
	}
}