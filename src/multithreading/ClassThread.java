package multithreading;

public class ClassThread {

    // Класс Thread служит для создания потока. В методе run прописываем код, который будет запускаться в потоке.
    // Метода start служит для запуска потока.
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 100; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
