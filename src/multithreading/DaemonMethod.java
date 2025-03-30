package multithreading;

public class DaemonMethod {

    // Daemon потоки выполняются в фоновом режиме и завершаются автоматически при завершении User потоков.
    // используются для оказания вспомогательных функций для основных потоков.

    public static void main(String[] args) {
        System.out.println("Main старт");

        UserTread userTread = new UserTread();
        userTread.setName("user_thread");

        DaemonTread daemonTread = new DaemonTread();
        daemonTread.setName("daemon_thread");
        daemonTread.setDaemon(true); // вызывается перед запуском потока и устанавливается значение true, что означает
        // что этот поток будет Daemon.

        userTread.start();
        daemonTread.start();

        System.out.println("Main стоп");
    }

}

class UserTread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonTread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}