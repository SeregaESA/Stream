package multithreading;

public class MethodSleepAndJoin extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);// Выводим имя потока
        }
    }

//    public static void main(String[] args) throws InterruptedException {
//
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000); // Останавливаем поток main на 1 сек.
//        }
//        System.out.println("Поехали!!!");
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        MethodSleepAndJoin thread2 = new MethodSleepAndJoin();
        thread1.start();
        thread2.start();

        thread1.join(); // Если на потоке вызван метод join, то метод В котором вызван этот поток будет ждать
        thread2.join(); // завершения этого потока и вы полнится метод. "Конец" в конце.

//        thread1.join(2000); В параметрах принимает милисекунды. Это значит, что поток main будет ждать 2 сек или
//        или завершения потока thread1 и выполнится поток main

        System.out.println("Конец"); // Выведется первый. Метод main запустит потоки и дальше выполнится сам
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);// Выводим имя потока
        }
    }
}


