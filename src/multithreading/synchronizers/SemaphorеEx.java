package multithreading.synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphorеEx {

    // Ограничевает доступ к ресурсу. В конструкторе указываем сколько потоков могут работать с ресурсом. Остальные
    // будут ждать

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Сергей", callBox);
        new Person("Натали", callBox);
        new Person("Кира", callBox);
        new Person("Варя", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт ...");
        try {
            callBox.acquire(); // Запрашивает разрешение у симафора на подключение
            System.out.println(name + " пользуется телефоном ");
            sleep(2000);
            System.out.println(name + " завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release(); // Освобождаем ресурс симафора
        }
    }
}



