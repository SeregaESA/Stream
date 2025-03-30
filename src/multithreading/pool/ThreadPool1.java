package multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool1 {
    public static void main(String[] args) {
        // Работа с ThreadPool происходит через объекты типа Executer (интерфей). Мы создаём poll потоков и передаём
        // задание в этот пул. Каждое новое задание поступает в наш poll и обрабатывается свободным потоком.

        ExecutorService executorService = Executors.newFixedThreadPool(5); // 5 потоков в poll
        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor(); // 1 поток в poll

        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyRunnable()); // метод execute передаёт наше задание в poll
        }

        executorService.shutdown(); // Принудительно останавливает работу нашего poll после выполнения всех задач.
        // Иначе будет ждать новых задач

        System.out.println("Main стоп");

    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


