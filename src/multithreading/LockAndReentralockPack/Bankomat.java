package multithreading.LockAndReentralockPack;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Employee("Сергей", lock);
        new Employee("Натали", lock);
        new Employee("Кира", lock);
        new Employee("Варя", lock);

    }
}

class Employee extends Thread {

    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) { // lock.tryLock() возвращает Boolean и говорит "Займи блок, если он свободен. Если нет,
            // то выполни другое действие" и больше не вернётся к выполнению этого кода.
            try {
//                System.out.println(name + " ждёт...");
//                lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + "  завершил пользование");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " Не хочу ждать");
        }
    }
}
