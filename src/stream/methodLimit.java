package stream;

import java.util.ArrayList;
import java.util.List;

public class methodLimit {
    public static void main(String[] args) {

        // метод limit возвращает стрим и ограничивает колличество элементов в стриме

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

        student2.stream().filter(el -> el.getAvgGrade() > 8).limit(2).forEach(System.out::println);

    }
}
