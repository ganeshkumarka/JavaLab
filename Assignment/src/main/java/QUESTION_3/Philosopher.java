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
public class Philosopher extends Thread{
    private Semaphore leftFork;
    private Semaphore rightFork;
    private int id;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Philosopher " + id + " is thinking");
                Thread.sleep((int) (Math.random() * 1000));

                leftFork.acquire();
                System.out.println("Philosopher " + id + " picked up left fork");
                rightFork.acquire();
                System.out.println("Philosopher " + id + " picked up right fork and is eating");
                Thread.sleep((int) (Math.random() * 1000));

                leftFork.release();
                System.out.println("Philosopher " + id + " put down left fork");
                rightFork.release();
                System.out.println("Philosopher " + id + " put down right fork");
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " was interrupted.");
        }
    }
}


