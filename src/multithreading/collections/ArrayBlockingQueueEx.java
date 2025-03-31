package multithreading.collections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    // ArrayBlockingQueue это потокобезопасная очередь с ограниченным размером.
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4); // При создании обязательно указывается
        // размер

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
//        queue.add(5); // Выбросится исключени, так как места в очереди нет
        queue.offer(5); // Исключения не будет. Просто элемент не добавится в очередь
        System.out.println(queue);

    }

}
