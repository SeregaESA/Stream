package multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServic {

    // ScheduledExecutorServicе используем, когда хотим устнаовить расписание на запуск потоков из poll

    public static void main(String[] args) throws InterruptedException {

        ExecutorService scheduledExecutorService1 = Executors.newCachedThreadPool(); // Такой poll будет сам создавать
        // потоки по мере поступления тасок. И удалит потоки после завершения тасок, если в течении 60 сек. на поток не
        // приходит новых тасок.

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.schedule(new MyRunnable1(), 3, TimeUnit.SECONDS); // В методе schedule мы
        // говорим: выполни new MyRunnable1() через 3 секунды

//        scheduledExecutorService.scheduleAtFixedRate(new MyRunnable2(), 3, 5, TimeUnit.SECONDS); //
        // планирует задачу для периодического выполнения. Время между заданиями считается от начала одного и до
        // начала следующего

        scheduledExecutorService.scheduleWithFixedDelay(new MyRunnable2(), 3, 5, TimeUnit.SECONDS); //
        // планирует задачу для периодического выполнения. Время между заданиями считается от конца одного и до
        // начала следующего

        Thread.sleep(20000);
        scheduledExecutorService.shutdown();
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "начал работу");
        System.out.println(Thread.currentThread().getName() + "закончил работу");
    }
}
