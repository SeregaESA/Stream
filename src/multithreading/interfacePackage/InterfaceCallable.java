package multithreading.interfacePackage;

import java.util.concurrent.*;

public class InterfaceCallable {
    static int factorialResult;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        Future<Integer> future =  executorService.submit(factorial); // Что бы передать таску в поток с Callable
        // нужно использовать метод submit, который возвращает результат. Метод execute ек пойдёт.
        // Результат вычисления хранится в объекте Future. И с помощью его методов можно работать с результатом.

        try {
            System.out.println(future.isDone()); // Узнаём закончилась таска или нет
            System.out.println("Хотим получить результат");
            factorialResult = future.get(); // Метод get блокирует поток в котором вызван до тех пор пока полностью
            // не будет завешина таска у executorService.submit(factorial)
            System.out.println("Получили результат");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult);

    }


}
// Интерфейс Callable в отличии от Runnable имеет метод call (делает тоже что и run), но вызвращает значение и может
// выбросить исключение. Можно использовать только с ExecutorService
class Factorial implements Callable<Integer> {
    int f;
    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if(f <= 0) {
            throw new Exception("Вы ввели не верное число");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *=i;
            Thread.sleep(1000);
        }
        return  result;
    }
}