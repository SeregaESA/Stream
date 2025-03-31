package multithreading.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    // ConcurrentHashMap имплементрует интерфейс ConcurrentMap, который происходит от интерф Map
    // В ConcurrentHashMap потоки могут работать (изменять данные) одновременно, но в разных бакетах. Если поток
    // начал работать в бакете, то он его блочит и другой поток с ним работать не сможет.
    // В ConcurrentHashMap в потоки не блокируют бакеты при чтении. Блокировка происходит только при изменении структуры
    // данных
    // В ConcurrentHashMap ключи и значения не могут быть null
    public static void main(String[] args) throws InterruptedException {

//        HashMap<Integer, String> map = new HashMap<>(); // При таком написании выбросит исключение
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Сергей");
        map.put(2, "Натали");
        map.put(3, "Кира");
        map.put(4, "Варя");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + ":" + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(1, "Pop");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);

    }
}
