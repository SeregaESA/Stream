package stream.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methodDistinct {
    public static void main(String[] args) {

        // Метод distinct возвращает новый список, убирая повторяющиеся элементы
        // Если применять его к спискам (например студентов), нужно что бы в этих классах были переопределины
        // методы equals и hashCode

        int[] array = {5, 9, 3, 8, 1, 1,2,3,4};
        int[] arraySorted = Arrays.stream(array).distinct().sorted().toArray();
        System.out.println(Arrays.toString(arraySorted));

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("1");
        list.add("2");
        list.add("5");
        list.add("6");

        List<String> listSorted = list.stream().distinct().sorted().toList();
        System.out.println(listSorted);

    }
}
