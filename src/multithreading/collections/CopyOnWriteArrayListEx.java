package multithreading.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    // CopyOnWriteArrayList импл List
    // CopyOnWriteArrayList следует использовать, если небольшое колличество операций по изменению, но большое
    // колличество по чтению, так как при изменении данных делаются копии.

    public static void main(String[] args) throws InterruptedException {

//        ArrayList<String> list = new ArrayList<>(); // Так будет исключене
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Сергей");
        list.add("Натали");
        list.add("Кира");
        list.add("Варя");

        Runnable runnable1 = () ->{
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(3);
            list.add("Pop");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);

    }
}
