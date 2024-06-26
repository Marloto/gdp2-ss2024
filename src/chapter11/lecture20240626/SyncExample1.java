package chapter11.lecture20240626;

class SomeExample {
    public void doSomething() {
        System.out.println("Hello! " + Thread.currentThread().getId());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable {
	SomeExample example = new SomeExample();
    public void run() {
        while(true) {
            example.doSomething();
        }
    }
}

public class SyncExample1 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}