package stream.terminal;



import stream.intermediate.StudentStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class methodCollect {
    public static void main(String[] args) {

        // В методе collect есть методы groupingBy и partitioningBy

        StudentStream st1 = new StudentStream("Mariya", 'W', 22,3, 8.3);
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

        // С помощью метода groupingBy (группировка по) мы сгрупировали список студентов по курсу, где номер курса это ключ, а
        // список студентов это значение, так как возвращается Map.

        Map<Integer, List<StudentStream>> map = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
        return el;}).collect(Collectors.groupingBy(el -> el.getCourse()));

        for(Map.Entry<Integer, List<StudentStream>> entry: map.entrySet()) {
            System.out.println("Номер курса - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        Map<Character, List<StudentStream>> map2 = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
            return el;}).collect(Collectors.groupingBy(el -> el.getSex()));

        for(Map.Entry<Character, List<StudentStream>> entry: map2.entrySet()) {
            System.out.println("Пол - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        Map<Double, List<StudentStream>> map3 = students.stream().map(el -> {el.setName(el.getName().toUpperCase());
            return el;}).collect(Collectors.groupingBy(el -> el.getAvgGrade()));

        for(Map.Entry<Double, List<StudentStream>> entry: map3.entrySet()) {
            System.out.println("Средний бал - " + entry.getKey() + ", список студентов " + entry.getValue().toString());
        }

        System.out.println("-------------------------------------");

        // partitioningBy (разделение по) принимает в параметры Предикей. В примере мы сгрупировали студентов,
        // у которых средний бал больше 7

        Map<Boolean, List<StudentStream>> map4 = students.stream().collect(Collectors.partitioningBy(el ->
                el.getAvgGrade() > 7));

        for(Map.Entry<Boolean, List<StudentStream>> entry: map4.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
