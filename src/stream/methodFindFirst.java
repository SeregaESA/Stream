package stream;

import java.util.ArrayList;
import java.util.List;

public class methodFindFirst {
    public static void main(String[] args) {

        // Метод findFirst выводит первый элемент стрима

        Student2 st1 = new Student2("Ivan", 'M', 22,3, 8.3);
        Student2 st2 = new Student2("Nikolay", 'M', 28,2, 6.4);
        Student2 st3 = new Student2("Elena", 'W', 19,1, 8.9);
        Student2 st4 = new Student2("Petr", 'M', 35,4, 7);
        Student2 st5 = new Student2("Mariya", 'W', 23, 3,9.1);

        List<Student2> student2 = new ArrayList<>();
        student2.add(st1);
        student2.add(st2);
        student2.add(st3);
        student2.add(st4);
        student2.add(st5);

        Student2 first = student2.stream().map(e -> {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'W')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();

        System.out.println(first);

    }
}
