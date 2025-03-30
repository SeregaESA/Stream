package multithreading;

public class MethodNameAndPriority {
    public static void main(String[] args) {
        MyThreads5 myThreads5 = new MyThreads5();

        myThreads5.setName("Мой поток"); // Задаём имя потока

        myThreads5.setPriority(9); // Приоритет задаётся от 0 до 10. Где 10 - самый высокий. Но не факт,
        // что самый высокий приоритет запустится первым
//        myThreads5.setPriority(Thread.MAX_PRIORITY); приоритет 10
//        myThreads5.setPriority(Thread.MIN_PRIORITY); приоритет 1
//        myThreads5.setPriority(Thread.NORM_PRIORITY); приоритет дефолтный 5

        System.out.println("Name of Thread5 = " + myThreads5.getName() + " " +
                "Priority5 = " + myThreads5.getPriority());

    }
}

class MyThreads5 extends Thread {
    @Override
    public void run() {
        System.out.println("Привет");
    }
}
