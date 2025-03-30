package multithreading.LockAndReentralockPack;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockAndReentrantLock {
    public static void main(String[] args) {
        Call call = new Call();

        Thread thread1 = new Thread(call::mobileCall);

        Thread thread2 = new Thread(call::skypeCall);

        Thread thread3 = new Thread(call::whatsappCall);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Call {
    private final Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock(); // Ставим блок на объекте
        try {
            System.out.println("mobile Call start");
            Thread.sleep(3000);
            System.out.println("mobile Call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock(); // Освобождаем блок для следующего потока
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("skype Call start");
            Thread.sleep(5000);
            System.out.println("skype Call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("whatsapp Call start");
            Thread.sleep(7000);
            System.out.println("whatsapp Call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}