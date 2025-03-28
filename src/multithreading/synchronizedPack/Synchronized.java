package multithreading.synchronizedPack;

public class Synchronized {
    public static void main(String[] args) {
        MyRunnableImpl runnable = new MyRunnableImpl();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl implements Runnable {

    // При применении слова  synchronized (применять только к методам) мы синхранизируем метод increment,
    // т.е. к нему может обратиться только один
    // поток. Что даёт нам последовательное увеличение переменной count. Если его не использовать, то потоки будут
    // работать с ней в беспорядочном режиме (каждый сам по себе. Data race - гонка данных).
    // Если мы синхроназируем метод, то по умолчанию ставится блок на this.
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
