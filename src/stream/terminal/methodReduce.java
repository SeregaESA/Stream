package stream.terminal;

import java.util.ArrayList;
import java.util.List;

public class methodReduce {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element)-> accumulator * element).get();
        System.out.println(result);
        // Начальный стрим 5, 8, 2, 4, 3
        // accumulator = 5  40  80  320 960 - изначально accumulator равен первому элементу списка, далее хранит результат
        // element =     8   2   4   3

        // Если пишем в аргументе три значения, то первое присваивается accumulator, далее accumulator хранит результат
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);

        int resultMax = list.stream().reduce(Integer::max).get();
        int resultMin = list.stream().reduce(Integer::min).get();
        System.out.println(resultMax);
        System.out.println(resultMin);

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("poka");
        list3.add("kak dela");
        list3.add("ok");
        list3.add("poka");

        String result3 = list3.stream().reduce((a, b) -> a + ", " + b).get();
        System.out.println(result3);

    }
}
