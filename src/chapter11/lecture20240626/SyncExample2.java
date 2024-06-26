package chapter11.lecture20240626;

public class SyncExample2 implements Runnable {
    private int zaehler = 0;
    
    public void run() {
        while(true) {
            this.doSomething();
        }
    }
    
    public void doSomething() { // <- hier wird this synchronisiert
    	System.out.println("Enter doSomething " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            int i;
            synchronized (this) {
				i = zaehler ++;
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	System.out.println("Exit doSomething " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        Runnable r = new SyncExample2(); // <-
        Thread thread1 = new Thread(r, "T1");
        Thread thread2 = new Thread(r, "T2");
        Thread thread3 = new Thread(r, "T3");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}