package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main {
    public static void main(String[] args) {

        Person person1 = new Person("a", 10);
        Person person2 = new Person("c", 25);
        Person person3 = new Person("d", 18);
        Person person4 = new Person("b", 30);

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        //list.forEach(System.out::println);

        //list.stream().map(Person::getName).forEach(System.out::println);
        //List<Person> list2 = new ArrayList<>();
        List<Person> list2 = list.stream().filter(person -> !person.getName().equals("Bob")).toList();

        //System.out.println(list2);

        int[] array = {2,1,8,4,10,9,20,17};
        int[] rew = Arrays.stream(array).filter(value -> value % 2 == 1).sorted().toArray();
        int[] rew1 = Arrays.stream(array).filter(value -> value % 2 == 1)
                .mapToObj(operand -> operand +1)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        int sum = Arrays.stream(array).filter(Value -> Value % 2 == 0).sum();
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println(max);
        System.out.println(min);
//        System.out.println(sum);
//        System.out.println(Arrays.toString(rew));
//        System.out.println(Arrays.toString(rew1));

        List<Person> list1 = list.stream().sorted(Comparator.comparing(Person::getName).reversed()).toList();
        //System.out.println(list1);

        List<Person> list3 = list.stream().sorted(Comparator.comparing(Person::getAge)).toList();
        //System.out.println(list3);

        Person re = list.stream().min(Comparator.comparing(Person::getAge)).get();
        //System.out.println(re);





    }
}
