package multithreading;

import java.util.Arrays;
import java.util.Map;

public class WaitNotify {
    public static void main(String[] args) {

        Market market = new Market();
        ThreadGroup group = new ThreadGroup("ThreadGroup");
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread threadProducer = new Thread(group, producer, "Producer Thread");
        Thread threadConsumer = new Thread(group, consumer,  "Consumer Thread");
        threadProducer.start();
        threadConsumer.start();
        System.out.println("Active: " + group.activeCount());
        System.out.println("Name: " + threadConsumer.getThreadGroup());
    }
}

class Market {
    private int breadCounter = 0;

    public synchronized void getBread() {
        while (breadCounter < 1) {
            try {
                wait(); // Эти методы вызываются на тех объектах, на которых идет блок. В этом примере this.wait()
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        breadCounter--;
        System.out.println("Потребитель взял 1 хлеб");
        System.out.println("Остаток хлеба = " + breadCounter);
        notify();// Эти методы вызываются на тех объектах, на которых идет блок
    }

    public synchronized void putBread() {
        while (breadCounter >= 5) {
            try {
                wait();// Эти методы вызываются на тех объектах, на которых идет блок
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCounter++;
        System.out.println("Производитель добавил 1 хлеб");
        System.out.println("Остаток хлеба = " + breadCounter);
        notify();// Эти методы вызываются на тех объектах, на которых идет блок
    }
}

class Producer implements Runnable {
    Market market;
    public Producer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;
    public Consumer(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
