package comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Сomparator {
    public static void main(String[] args) {
        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(15, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(150, "Ivan", "Petrov", 6789);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 159879);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.stream().forEach(System.out::println);
        System.out.println("-------------------------");
        // Без второго переметра сортировка идет по Comparable
        Collections.sort(list1);
        list1.stream().forEach(System.out::println);
        System.out.println("-------------------------");
        // Но если нужна другая сортировка, добавляют вторым параметром Comparator
        Collections.sort(list1, new SalaryСomparator());
        list1.stream().forEach(System.out::println);

        System.out.println("-------------------------");
        list1.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);


    }
}
// Создаём компаратор, который сортирует по id
class IdСomparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else  if (emp1.id < emp2.id) {
            return  -1;
        }else {
            return 1;
        }
    }
}

// Создаём компаратор, который сортирует по name
class NameСomparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryСomparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
