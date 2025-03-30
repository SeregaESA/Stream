package multithreading;

public class Interruption {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main старт");
        InterrupterdThread thread = new InterrupterdThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt(); // посылаем сигнал потоку, что хотим его остановить

        thread.join();
        System.out.println("Main стоп");

    }
}

class InterrupterdThread extends Thread {
    double sgrtSum = 0;

    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()){ // Поток проверяет, хотят ли его закрыть
                System.out.println("Останавливаем поток");
                return;
            }
            sgrtSum += Math.sqrt(i);
        }
        System.out.println(sgrtSum);
    }
}