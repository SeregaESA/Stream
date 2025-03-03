package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methodCount {
    public static void main(String[] args) {

        // Метод count (конечный) возвращает (Long) число объектов в стриме

        int[] array = {5, 9, 3, 8, 1, 1,2,3,4};
        System.out.println(Arrays.stream(array).count());

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("2");
        list.add("5");
        list.add("6");
        System.out.println("Колличество элементов в списке - " + list.stream().count());
        System.out.println("Колличество уникальных элементов в списке - " + list.stream().distinct().count());
        System.out.println("Колличество повторяющихся элементов в списке - " +
                (list.stream().count() - list.stream().distinct().count()));

    }
}
