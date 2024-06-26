package chapter11.lecture20240626;

import java.util.ArrayList;
import java.util.List;

public class ThreadedList {
    private static final int NUM_THREADS = 10;
    private static final int OPERATIONS_PER_THREAD = 1000;

    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsynchronizedList = new ArrayList<>();
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < OPERATIONS_PER_THREAD; j++) {
                    unsynchronizedList.add(1);
                }
            });
            threads[i].start();
        }

        // Warten auf alle Threads
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Erwartete Größe: " + (NUM_THREADS * OPERATIONS_PER_THREAD));
        System.out.println("Tatsächliche Größe: " + unsynchronizedList.size());

        int sum = unsynchronizedList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Erwartete Summe: " + (NUM_THREADS * OPERATIONS_PER_THREAD));
        System.out.println("Tatsächliche Summe: " + sum);
    }
}
