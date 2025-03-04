package comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        // Интерфейс Comparable нужен для сравнения объектов друг с другом при работе с коллекциями
        // и массивами используя естественный порядок. Для этого нужно имплементировать интерфейс
        // Comparable в класс и переопределить метод compareTo

        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Bob");
        list.add("Sergei");
//        System.out.println("Перед сортировкой");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println("После сортировки");
//        System.out.println(list);

        List<Employee> list1 = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6789);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 159879);
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.stream().forEach(System.out::println);
        System.out.println("---------------");

        // Что бы указать поля по которым будет производиться сортировка, нужен Comparable

        Collections.sort(list1);
        list1.stream().forEach(System.out::println);


    }
}

class Employee implements java.lang.Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {

        if (this.id == anotherEmp.id) {
            return 0;
        } else  if (this.id < anotherEmp.id) {
            return  -1;
        }else {
            return 1;
        }

        // Можно сделать запись короче

        // return this.id - anotherEmp.id;

        // Классы String и Integer имплимент Comparable. Записывать можно так
        // return this.name.compareTo(anotherEmp.name);

        // Если сравнивыемые параметры равны, можно настроить сравнение по следующему переметру
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res == 0) {
//            res = this.surname.compareTo(anotherEmp.surname);
//        } return res;

    }
}
