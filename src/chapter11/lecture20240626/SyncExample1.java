package chapter11.lecture20240626;

class SomeExample {
	private static Object syncher = new Object();
	
	
    public /*...*/ void doSomething() {
    	synchronized (syncher) {
	        System.out.println("Hello! " + Thread.currentThread().getId());
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
    	}
    }
}

class MyRunnable implements Runnable {
	SomeExample example = new SomeExample(); // jetzt eine instanze
	
    public void run() {
        while(true) {
            example.doSomething();
            // "simulation" für anweisungen nach der doSomething, damit jemand anders auch in der doSomething arbeiten kann
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

public class SyncExample1 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}