package stream;

import java.util.stream.Stream;
public class methodConcat {
    public static void main(String[] args) {

        // Метод concat статичный и возвращает Stream
        Stream<Integer> array = Stream.of(5,6,7,8);
        Stream<Integer> array1 = Stream.of(1,2,3,4);

        Stream<Integer> array2 = Stream.concat(array, array1);
        array2.forEach(System.out::println);
    }
}
