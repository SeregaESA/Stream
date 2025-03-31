package multithreading.synchronizers;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {

    // AtomicInteger - это класс, который позволяет работать с цулочисленными значениями int используя атомарные операции

    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() { // При использовании AtomicInteger метод синхранизировать уже не нужно
//        counter.incrementAndGet(); // Увеличиваем на 1 значение и получаем
        counter.addAndGet(5); // Получаем и увеличиваем на 5
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable2());
        Thread thread2 = new Thread(new MyRunnable2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerEx.increment();
        }
    }
}
