package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class methodSorted {
    public static void main(String[] args) {

        // sorted сортирует числа по возрастанию
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        //System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        //System.out.println(list);

        list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //System.out.println(list);
        List<Integer> sort = list.stream().filter(integer -> integer % 2 != 0).sorted(Comparator.reverseOrder()).toList();
        System.out.println(sort);

        list = list.stream().sorted().toList();
        //System.out.println(list);

        Student1 st1 = new Student1("Ivan", 'M', 22,3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'M', 28,2, 6.4);
        Student1 st3 = new Student1("Elena", 'W', 19,1, 8.9);
        Student1 st4 = new Student1("Petr", 'M', 35,4, 7);
        Student1 st5 = new Student1("Mariya", 'W', 23, 3,9.1);

        List<Student1> students1 = new ArrayList<>();
        students1.add(st1);
        students1.add(st2);
        students1.add(st3);
        students1.add(st4);
        students1.add(st5);

        students1 = students1.stream().sorted(Comparator.comparing(Student1::getAvgGrade)).collect(Collectors.toList());
        //System.out.println(students1);

        students1 = students1.stream().sorted(Comparator.comparing(Student1::getSex)).collect(Collectors.toList());
        //System.out.println(students1);

        students1 = students1.stream().sorted(Comparator.comparing(Student1::getName)).collect(Collectors.toList());
        //System.out.println(students1);

    }
}

class Student1 {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name,char sex, int age, int course, double avgGrade) {
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
