package multithreading.synchronizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

    // Синхронизатор, позволяющий ждать любому колличеству потоков ждать пока не завершиться определённое
    // колличество операций. В конструкторе передаётся счетчик операций

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Персонал магазина на работе");
        countDownLatch.countDown(); // Метод countDown() уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch " + countDownLatch.getCount()); // Выводим состояние счетчика
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Всё готово к продаже");
        countDownLatch.countDown(); // Метод countDown() уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch " + countDownLatch.getCount()); // Выводим состояние счетчика
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Магазин открыт");
        countDownLatch.countDown(); // Метод countDown() уменьшает счетчик countDownLatch на 1
        System.out.println("countDownLatch " + countDownLatch.getCount()); // Выводим состояние счетчика
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Сергей", countDownLatch);
        new Friend("Натали", countDownLatch);
        new Friend("Кира", countDownLatch);
        new Friend("Варя", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    private final String name;
    private final CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await(); // Проверяет, что счетчик равен 0
            System.out.println(name + " приступили к покупкам");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
