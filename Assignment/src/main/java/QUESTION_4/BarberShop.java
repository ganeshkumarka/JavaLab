/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION_4;

/**
 *
 * @author cusat
 */
import java.util.concurrent.Semaphore;
public class BarberShop {
    private Semaphore customers = new Semaphore(0);
    private Semaphore barber = new Semaphore(0);
    private Semaphore accessSeats = new Semaphore(1);
    private int numWaitingChairs;
    private int numCustomers;

    public BarberShop(int numWaitingChairs, int numCustomers) {
        this.numWaitingChairs = numWaitingChairs;
        this.numCustomers = numCustomers;
    }

    public void barber() throws InterruptedException {
        while (true) {
            customers.acquire();
            accessSeats.acquire();
            numWaitingChairs++;
            barber.release();
            accessSeats.release();

            // Cut hair
            System.out.println("Barber is cutting hair.");

            Thread.sleep(1000); // Simulate hair cutting

            System.out.println("Barber finished cutting hair.");
        }
    }

    public void customer(int id) throws InterruptedException {
        accessSeats.acquire();

        if (numWaitingChairs > 0) {
            numWaitingChairs--;
            customers.release();
            accessSeats.release();
            barber.acquire();
            // Getting a haircut
            System.out.println("Customer " + id + " is getting a haircut.");
        } else {
            accessSeats.release();
            // Leave without getting a haircut
            System.out.println("Customer " + id + " is leaving.");
        }
    }
}
