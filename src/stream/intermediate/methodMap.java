package stream.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class methodMap {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

        //метод map перебирает каждый элемент стрима и на выходе новый стрим, но уже откоректированный по
        // лямбда выражению. В примере будет уже длинна каждого слова
        Set<Integer> list2 = list.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(list2);

        list = list.stream().map(e -> {
            if (e.equals("poka")) {
                return  "bob";
            }
            return e;
        }).toList();
        System.out.println(list);

        int[] array = {5, 9, 3, 8, 1};
        int max = Arrays.stream(array).min().getAsInt();
        System.out.println(max);

        System.out.println(Arrays.stream(array).max().getAsInt());

        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        } ).toArray();
        //System.out.println(Arrays.toString(array));

        double[] doubleArray = {7.2, 9.8, 5.5, 1.0, 7.3};
        double maxDouble = Arrays.stream(doubleArray).max().getAsDouble();
        double sum = Arrays.stream(doubleArray).reduce(1.0, (a, b) -> a * b);
        System.out.println(sum);
        System.out.println(maxDouble);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Integer maxInteger = integerList.stream().reduce(Integer::max).get();
        System.out.println(maxInteger);
    }
}
