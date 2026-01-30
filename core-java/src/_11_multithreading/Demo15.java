package _11_multithreading;

public class Demo15 {
    public static void main(String[] args) throws InterruptedException {
        class Shared {
            int data;
            boolean available = false;

            synchronized void produce(int value) throws InterruptedException {
                while (available) {
                    wait();
                }
                data = value;
                available = true;
                System.out.println("Produced " + data);
                notify();
            }

            synchronized void consume() throws InterruptedException {
                while (!available) {
                    wait();
                }
                System.out.println("Consumed " + data);
                available = false;
                notify();
            }
        }
        Shared sharedObject = new Shared();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <=100 ; i++) {
                try {
                    sharedObject.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "producer");
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <=100 ; i++) {
                try {
                    sharedObject.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "consumer");

        producer.start();
        consumer.start();
    }

}
