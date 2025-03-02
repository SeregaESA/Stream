package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;


public class StudentInfo {

//    void printStudentOverGrate(ArrayList<Student> students, double grade) {
//        for (Student student : students) {
//            if (student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> students, int age) {
//        for (Student student : students) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> students, double grade, int age, char sex) {
//        for (Student student : students) {
//            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

    // Можно эти методы не писать, а создать интерфейс и приминить его

    void testStudents(ArrayList<Student> students, StudentChecks checks) {
        for (Student student : students) {
            if (checks.checkStudent(student)) {
                System.out.println(student);
            }
        }
    }

    // Что бы не писать свой ФИ, можно использовать встроенные ФИ. Например Predicate с методом boolean test(T t)

    void testStudentsPredicate(ArrayList<Student> students, Predicate<Student> predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'M', 22,3, 8.3);
        Student st2 = new Student("Nikolay", 'M', 28,2, 6.4);
        Student st3 = new Student("Elena", 'F', 19,1, 8.9);
        Student st4 = new Student("Petr", 'M', 35,4, 7);
        Student st5 = new Student("Mariya", 'F', 23, 3,9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.printStudentOverGrate(students, 8);
//        System.out.println("----------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("----------------");
//        info.printStudentsMixCondition(students, 9.5, 20, 'F');

        // 2-ой способ через StudentChecks

//        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("----------------");

        // Через аннонимный класс. Приминяется, если используется фильтрация 1 раз,
        // что бы не создавать CheckOverGrade

//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean checkStudent(Student s) {
//                return s.age < 30;
//            }
//        });
//        System.out.println("----------------");

        // Через лямда выражение. Вместо второго аргумента (ананимного класса) мы просто берём параметр абстактного
        // метода и переопределяем его

//        info.testStudents(students, (Student s) -> s.age < 30);
        // Можно записать короче, только если в параметрах один аргумент. Если больше, то пишем полное название
        // аргументов в скобках
        info.testStudents(students,  s -> s.age < 30);
        info.testStudentsPredicate(students, s -> s.age == 22);
        System.out.println("----------------");

//        info.testStudents(students, (Student s) -> s.avgGrade < 8);
        info.testStudents(students, s -> s.avgGrade < 8);
        System.out.println("----------------");

//        info.testStudents(students, (Student s) ->
//                s.age > 20 && s.avgGrade < 9.3 && s.sex == 'F');
        info.testStudents(students, s ->
                s.age > 20 && s.avgGrade < 9.3 && s.sex == 'F');
        System.out.println("----------------");

//        info.testStudents(students, (Student s) -> s.name.equals("Elena"));
        info.testStudents(students, s -> s.name.equals("Elena"));
        System.out.println("----------------");

//        info.testStudents(students, (Student s) -> s.age == 22);
//        info.testStudents(students, s -> s.age == 22);

        // Можно результат лямбда выражения присвоить переменной
        StudentChecks checks = (Student s) -> s.age == 22;
        info.testStudents(students, checks);

        // Если хотим вернуть более одного параметра, то запись будет
        System.out.println("---------------");
        info.testStudents(students, s -> {
            System.out.println("hello");
            return s.name.equals("Elena");
        });
        System.out.println("---------------");
        double res = avgOf(students, student -> student.avgGrade);
        System.out.println(res);
    }

// Использование ФИ Function. Принимает в методк два аргумента (первый перебирает, второй возвращает)

    Function<Student, Double> f = student -> student.avgGrade;

    private static double avgOf(List<Student> list, Function<Student, Double> f) {
        double sum = 0.0;
        for (Student student : list) {
            sum += f.apply(student);
        }
        return sum / list.size();
    }
}

// Такой интерфейс будет считаться функциональным, который содержит 1 абстрактный метод. Java в лямбда выражении
// будет искать его. Дефолтных и статик метод может быть хоть сколько
interface StudentChecks{
    boolean checkStudent(Student s);
}

//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean checkStudent(Student s) {
//        return s.avgGrade > 8;
//    }
//}
