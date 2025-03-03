package stream;

import java.util.ArrayList;
import java.util.List;

public class methodPeek {
    public static void main(String[] args) {

        // Метод peek промежуточный. Такой же как forEach, но промежуточный.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(1);
        list.add(7);
        list.add(6);
        List<Integer> sortList = list.stream().distinct().peek(System.out::println).sorted().toList();

        System.out.println(sortList);

    }
}
