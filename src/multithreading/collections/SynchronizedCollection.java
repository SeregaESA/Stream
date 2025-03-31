package multithreading.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

//        ArrayList<Integer> target = new ArrayList<>(); // При таком не синхронезированном списке, результат работы
        // будет не предсказуем

        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>()); // Такой записью мы обернули
        // новосозданный ArrayList (можно передать уже готовый список) в синхронизированный List.
        // Он ставит lock, если с ним начал работать один поток и остальные потоки ждут освобождения

        Runnable runnable = () -> {synchList.addAll(list);}; // Если мы в методе run испльзуем итератор, то его
        // нужно синхранизировать на коллекции, которую итерируем. Так как он не ставит lock на на неё и может
        // выбросить исключение.

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(synchList);

    }
}
