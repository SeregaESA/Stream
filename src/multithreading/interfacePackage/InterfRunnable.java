package multithreading.interfacePackage;

public class InterfRunnable {

    // Что бы не наследоваться от класса Thread, можно реализовывать интерфейс Runnable. В нем всего один метод run.
    public static void main(String[] args) {

        // Создание потока через класс Thread
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.start();
        thread2.start();

        // Можно создать поток через лямбда

        new Thread(() -> System.out.println("Привет")).start();

    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for(int i = 100; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
