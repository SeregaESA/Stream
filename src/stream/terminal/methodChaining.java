package stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class methodChaining {
    public static void main(String[] args) {

        // Метод вызова нескольких методов стрим

        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int result = Arrays.stream(array).filter(e -> e % 2 == 1).map(e -> {
            if (e % 3 == 0) { e = e/3;}
            return e;
        }).reduce(Integer::sum).getAsInt();
        System.out.println(result);

        StudentStream2 st1 = new StudentStream2("Ivan", 'M', 22,3, 8.3);
        StudentStream2 st2 = new StudentStream2("Nikolay", 'M', 28,2, 6.4);
        StudentStream2 st3 = new StudentStream2("Elena", 'W', 19,1, 8.9);
        StudentStream2 st4 = new StudentStream2("Petr", 'M', 35,4, 7);
        StudentStream2 st5 = new StudentStream2("Mariya", 'W', 23, 3,9.1);

        List<StudentStream2> student2 = new ArrayList<>();
        student2.add(st1);
        student2.add(st2);
        student2.add(st3);
        student2.add(st4);
        student2.add(st5);

        student2.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e -> e.getSex() == 'W')
                .sorted(Comparator.comparingInt(StudentStream2::getAge))
                .forEach(System.out::println);
    }
}
