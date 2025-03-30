package multithreading.synchronizedPack;

public class SynchronizeBlock {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImpl2 implements Runnable {
    public void doWork() {
        synchronized (this) { // Такой записью мы поставили блок на манитор объекта класса MyRunnableImpl2. В скобках
            // мы указываем на какой объект ставим блок
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork();
        }
    }
}
