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
public class SleepingBarberExample {
     public static void main(String[] args) {
        int numWaitingChairs = 3;
        int numCustomers = 5;
        BarberShop barberShop = new BarberShop(numWaitingChairs, numCustomers);

        Thread barberThread = new Thread(() -> {
            try {
                barberShop.barber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        barberThread.start();

        for (int i = 0; i < numCustomers; i++) {
            final int id = i;
            Thread customerThread = new Thread(() -> {
                try {
                    barberShop.customer(id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            customerThread.start();
        }
    }
}
