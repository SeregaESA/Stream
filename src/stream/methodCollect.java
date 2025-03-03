package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class methodCollect {
    public static void main(String[] args) {

        // В методе collect есть методы groupingBy и partitioningBy

        Student st1 = new Student("Mariya", 'W', 22,3, 8.3);
        Student st2 = new Student("Nikolay", 'M', 28,2, 6.4);
        Student st3 = new Student("Elena", 'W', 19,1, 8.9);
        Student st4 = new Student("Petr", 'M', 35,4, 7);
        Student st5 = new Student("Bob", 'M', 22,3, 8.3);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // С помощью метода groupingBy (группировка по) мы сгрупировали список студентов по курсу, где номер курса это ключ, а
        // список студентов это значение, так как возвращается Map.

        Map<Integer, List<Student>> map = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
        return el;}).collect(Collectors.groupingBy(el -> el.getCourse()));

        for(Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
            System.out.println("Номер курса - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        Map<Character, List<Student>> map2 = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
            return el;}).collect(Collectors.groupingBy(el -> el.getSex()));

        for(Map.Entry<Character, List<Student>> entry: map2.entrySet()) {
            System.out.println("Пол - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        Map<Double, List<Student>> map3 = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
            return el;}).collect(Collectors.groupingBy(el -> el.getAvgGrade()));

        for(Map.Entry<Double, List<Student>> entry: map3.entrySet()) {
            System.out.println("Средний бал - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        // partitioningBy (разделение по) принимает в параметры Предикей. В примере мы сгрупировали студентов,
        // у которых средний бал больше 7

        Map<Boolean, List<Student>> map4 = students.stream().collect(Collectors.partitioningBy(el ->
                el.getAvgGrade() > 7));

        for(Map.Entry<Boolean, List<Student>> entry: map4.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
