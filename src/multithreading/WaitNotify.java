package multithreading;

public class WaitNotify {
    public static void main(String[] args) {

        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();



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
