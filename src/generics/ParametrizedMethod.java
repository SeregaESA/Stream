package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        int a = GenMethod.getSecondElement(listInteger);
        System.out.println(a);

        ArrayList<String> listString = new ArrayList<>();
        listString.add("Привет");
        listString.add("Пока");
        listString.add("Витя");

        String a2 = GenMethod.getSecondElement(listString);
        System.out.println(a2);

        Integer[] array = {1, 2, 3};
        System.out.println(GenMethod.getElement(array));


    }
}

class GenMethod {

// ArrayList<T> в этом месте пишем вмесот <T> парраметр, который будем возвращать (return будет тип <T>)
// T getSecondElement - T перед именем метода указывает какой тип будет возвращать метод
// <T> указывает java, что Т перед метод является параметризирванной. Если его убрать, то java не поймёт что такое Т

    public static <T> T getSecondElement(ArrayList<T> list) {
        return list.get(0);
    }

    public static <T> T getElement(T[] array) {
        return array[0];
    }
}
