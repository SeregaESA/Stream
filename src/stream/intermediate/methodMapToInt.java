package stream.intermediate;

import stream.terminal.StudentStream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class methodMapToInt {
    public static void main(String[] args) {

        // Возвращает int стрим после себя

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

        List<Integer> courses = student2.stream()
                .mapToInt(el -> el.getCourse())
                // метод boxed конвертирует int в Integer
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);

        int sum = student2.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        // Метод average возвращает среднее ариф. типа Optional double, поэтому используем getAsDouble
        double average = student2.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);

        int min = student2.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = student2.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}
