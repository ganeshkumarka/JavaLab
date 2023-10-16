public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

class SharedBuffer {
    private int[] buffer;
    private int size;
    private int count;
    private int in;
    private int out;

    public SharedBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
        this.in = 0;
        this.out = 0;
    }

    public void produce(int item) throws InterruptedException {
        while (count == size) {
            Thread.sleep(100);
        }

        buffer[in] = item;
        in = (in + 1) % size;
        count++;

        System.out.println("Produced: " + item);
    }

    public int consume() throws InterruptedException {
        while (count == 0) {
            Thread.sleep(100);
        }

        int item = buffer[out];
        out = (out + 1) % size;
        count--;

        System.out.println("Consumed: " + item);
        return item;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                buffer.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                int item = buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
