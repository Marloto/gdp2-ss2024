package chapter11.lecture20240626;

public class Counter {
	private static final int NUM_THREADS = 1000;
	private static final int INCREMENTS_PER_THREAD = 1000;

	private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();

        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Number of Thread and Iterations: " +
                (NUM_THREADS * INCREMENTS_PER_THREAD));
        System.out.println("Value of Counter: " + counter.getCount());
    }
}
