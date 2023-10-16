import java.util.concurrent.Semaphore;

class Philosopher extends Thread {
    private final int id;
    private Semaphore leftFork;
    private Semaphore rightFork;
    private static Semaphore tableSemaphore = new Semaphore(4); // Number of philosophers

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true) {
            try {
                tableSemaphore.acquire(); // Only 4 philosophers allowed at the table
                leftFork.acquire(); // Pick up left fork
                rightFork.acquire(); // Pick up right fork
                System.out.println("Philosopher " + id + " is eating.");
                leftFork.release(); // Put down left fork
                rightFork.release(); // Put down right fork
                tableSemaphore.release(); // Release table for others
                think();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void think() {
        System.out.println("Philosopher " + id + " is thinking.");
        try {
            Thread.sleep(1000); // Simulate thinking time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class DiningPhilosophersExample {
    public static void main(String[] args) {
        int numPhilosophers = 5; // Number of philosophers
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Semaphore[] forks = new Semaphore[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Semaphore(1); // Initialize forks (1 fork per philosopher)
        }

        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % numPhilosophers]);
            philosophers[i].start();
        }
    }
}
