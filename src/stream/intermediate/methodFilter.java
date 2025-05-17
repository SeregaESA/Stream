package stream.intermediate;

import java.util.*;

public class methodFilter {
    public static void main(String[] args) {
        StudentStream st1 = new StudentStream("Mariya", 'M', 22,3, 8.3);
        StudentStream st2 = new StudentStream("Nikolay", 'M', 28,2, 6.4);
        StudentStream st3 = new StudentStream("Elena", 'W', 19,1, 8.9);
        StudentStream st4 = new StudentStream("Petr", 'M', 35,4, 7);
        StudentStream st5 = new StudentStream("Bob", 'M', 22,3, 8.3);

        List<StudentStream> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students = students.stream().filter(student
//                -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
        //System.out.println(students);

        List<StudentStream> studentsMan = students.stream().filter(student -> student.getSex() == 'M').toList();
        List<StudentStream> studentsWoman = students.stream().filter(student -> student.getSex() == 'W').toList();
//        System.out.println(studentsMan);
//        System.out.println(studentsWoman);

        Optional<StudentStream> maxAvgGrade = students.stream().max(Comparator.comparingDouble(StudentStream::getAvgGrade));
        System.out.println("Cтудент " + maxAvgGrade.get().getName() + ", " + "с баллом " + maxAvgGrade.get().getAvgGrade());
        //studentsMan.forEach(System.out::println);

        StudentStream rt = students.stream().filter(student -> student.getName().equals("Elena")).findFirst().get();
        //System.out.println(rt);

        double result = students.stream().mapToDouble(StudentStream::getAvgGrade).sum();
        double ser = result / students.size();
        double result2 = students.stream().mapToDouble(StudentStream::getAvgGrade).average().getAsDouble();
        System.out.println(result);
        System.out.println(ser);
        System.out.println(result2);

        students.stream().distinct().forEach(System.out::println);
        System.out.println("Количество студентов в списке " + students.stream().count());

    }
}

class Util1 {
    public static void myMethod (int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
