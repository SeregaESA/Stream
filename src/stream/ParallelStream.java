package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        // Парралельные стримы потходят если много данных и не важна последовательность

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sum = list.stream().reduce((ac, el) -> ac + el).get();
        System.out.println("sum = " + sum);

        double sumParallel = list.parallelStream().reduce((ac, el) -> ac + el).get();
        System.out.println("sumParallel = " + sumParallel);

        // Пример где важна последовательность. Результаты не равны.
        double resultDelenie = list.stream().reduce((ac, el) -> ac / el).get();
        System.out.println("resultDelenie = " + resultDelenie);

        double resultDelenieParall = list.parallelStream().reduce((ac, el) -> ac / el).get();
        System.out.println("resultDelenie = " + resultDelenieParall);

    }
}
