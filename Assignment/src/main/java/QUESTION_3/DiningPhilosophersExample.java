/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_3;

/**
 *
 * @author cusat
 */
import java.util.concurrent.Semaphore;
public class DiningPhilosophersExample {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Semaphore[] forks = new Semaphore[numPhilosophers];
        
        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Semaphore(1); // Initialize forks, 1 indicates it's available
        }
        
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        
        for (int i = 0; i < numPhilosophers; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % numPhilosophers]);
            philosophers[i].start();
        }
    }
}