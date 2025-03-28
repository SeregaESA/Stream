package multithreading;

public class Volatile extends Thread {
    // ключевое слово volatile (можно использовать, когда только один поток меняет переменную) перед переменной
    // означает, что её значение будет хранится только в основной памяти
    // и не будет копироваться в кэш потоков. И при изменении его значения в одном потоке, другие потоки сразу получат
    // это изменение. Если его нет, то значения переменных могут хранится в кэшэ потока и при изменении переменной
    // в однои потоке, другие могут не получить изменение.
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("While finish. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {

        Volatile thread = new Volatile();
        thread.start(); // Запускаем поток
        Thread.sleep(3000); // main спит 3 сек
        System.out.println("Sleep end");
        thread.b = false;
        thread.join(); // main ждёт выполнения потока
        System.out.println("End main");

    }
}
