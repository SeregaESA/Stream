package multithreading.collections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(() ->{
            int i = 0;
            while (true) {
                try {
                    queue.put(++i); // Будет добавлять пока не заполнится полностью очередь. Дальше будет ждать,
                    // пока Consumer заберёт число из очереди
                    System.out.println("Добавленно число - " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // Consumer
        new Thread(() ->{
            while (true) {
                try {
                    Integer j = queue.take(); // будет забирать из начала очереди пока есть элементы, если закончатся,
                    // будет ожидать пока Producer не добавит элементы
                    System.out.println("Взято число - " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
