package stream;

import java.util.Arrays;

public class methodForEach {
    public static void main(String[] args) {

        // Метод forEach возвращает void

        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(Util::myMethod);

        Arrays.stream(array).forEach(el -> {el *= 2;
        System.out.println(el);});

    }
}

class Util {
    public static void myMethod (int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
