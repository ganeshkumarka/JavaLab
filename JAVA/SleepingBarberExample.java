import java.util.concurrent.Semaphore;

class BarberShop {
    private final int numChairs;
    private Semaphore customers = new Semaphore(0);
    private Semaphore barber = new Semaphore(0);
    private Semaphore accessSeats = new Semaphore(1);

    public BarberShop(int numChairs) {
        this.numChairs = numChairs;
    }

    public void customerArrives(int customerNumber) {
        try {
            accessSeats.acquire();
            if (customers.availablePermits() < numChairs) {
                System.out.println("Customer " + customerNumber + " arrived and is waiting.");
                customers.release();
                accessSeats.release();
                barber.acquire();
                getHaircut(customerNumber);
            } else {
                System.out.println("Customer " + customerNumber + " arrived but left because the shop is full.");
                accessSeats.release();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void barberReady() {
        try {
            while (true) {
                customers.acquire();
                accessSeats.acquire();
                System.out.println("Barber is cutting hair.");
                barber.release();
                accessSeats.release();
                Thread.sleep(2000); // Simulate haircut time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void getHaircut(int customerNumber) {
        System.out.println("Customer " + customerNumber + " is getting a haircut.");
    }
}

class CustomerThread extends Thread {
    private final BarberShop barberShop;
    private final int customerNumber;

    public CustomerThread(BarberShop barberShop, int customerNumber) {
        this.barberShop = barberShop;
        this.customerNumber = customerNumber;
    }

    @Override
    public void run() {
        barberShop.customerArrives(customerNumber);
    }
}

class BarberThread extends Thread {
    private final BarberShop barberShop;

    public BarberThread(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        barberShop.barberReady();
    }
}

public class SleepingBarberExample {
    public static void main(String[] args) {
        BarberShop barberShop = new BarberShop(3); // 3 chairs in the waiting area
        BarberThread barber = new BarberThread(barberShop);
        barber.start();

        for (int i = 1; i <= 10; i++) {
            CustomerThread customer = new CustomerThread(barberShop, i);
            customer.start();
            try {
                Thread.sleep(1000); // Introduce a delay between customer arrivals
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
