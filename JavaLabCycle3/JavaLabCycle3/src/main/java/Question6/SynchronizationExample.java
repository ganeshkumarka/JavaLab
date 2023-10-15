/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question6;

/**
 *
 * @author ganes
 */
public class SynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread incrementThread = new Thread(new ProcessingThread(sharedResource, "Increment Thread", true));
        Thread decrementThread = new Thread(new ProcessingThread(sharedResource, "Decrement Thread", false));

        incrementThread.start();
        decrementThread.start();
    }
}

class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Incremented: " + count);
        }
    }

    public synchronized void decrement() {
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - Decremented: " + count);
        }
    }
}

class ProcessingThread implements Runnable {
    private SharedResource sharedResource;
    private String threadName;
    private boolean isIncrement;

    public ProcessingThread(SharedResource sharedResource, String threadName, boolean isIncrement) {
        this.sharedResource = sharedResource;
        this.threadName = threadName;
        this.isIncrement = isIncrement;
    }

    public void run() {
        System.out.println(threadName + " started.");
        if (isIncrement) {
            sharedResource.increment();
        } else {
            sharedResource.decrement();
        }
        System.out.println(threadName + " finished.");
    }
}

