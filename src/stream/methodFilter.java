package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class methodFilter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'M', 22,3, 8.3);
        Student st2 = new Student("Nikolay", 'M', 28,2, 6.4);
        Student st3 = new Student("Elena", 'W', 19,1, 8.9);
        Student st4 = new Student("Petr", 'M', 35,4, 7);
        Student st5 = new Student("Mariya", 'W', 23, 3,9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students = students.stream().filter(student
//                -> student.getAge() > 22 && student.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
        //System.out.println(students);

        List<Student> studentsMan = students.stream().filter(student -> student.getSex() == 'M').toList();
        List<Student> studentsWoman = students.stream().filter(student -> student.getSex() == 'W').toList();
        System.out.println(studentsMan);
        System.out.println(studentsWoman);

        Optional<Student> maxAvgGrade = students.stream().max(Comparator.comparingDouble(Student::getAvgGrade));
        System.out.println("Cтудент " + maxAvgGrade.get().getName() + ", " + "с баллом " + maxAvgGrade.get().getAvgGrade());
        //studentsMan.forEach(System.out::println);

        Student rt = students.stream().filter(student -> student.getName().equals("Elena")).findFirst().get();
        System.out.println(rt);

        double result = students.stream().mapToDouble(Student::getAvgGrade).sum();
        double ser = result / students.size();
        System.out.println(result);
        System.out.println(ser);
    }
}

class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name,char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.avgGrade = avgGrade;
        this.sex = sex;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
class Util1 {
    public static void myMethod (int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}
