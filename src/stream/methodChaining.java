package stream;

import java.util.ArrayList;
import java.util.Arrays;
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

        student2.stream().map(e -> {
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e -> e.getSex() == 'W')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
    }
}

class Student2 {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name,char sex, int age, int course, double avgGrade) {
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
