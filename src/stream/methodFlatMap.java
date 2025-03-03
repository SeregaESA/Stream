package stream;

import java.util.ArrayList;
import java.util.List;

public class methodFlatMap {
    public static void main(String[] args) {

        // Метод flatMap (промежуточный) даёт возможность создать стрим из вложенного списка. На примере - facultyList содержит
        // список факультетов, а в факультетах есть еще списки студентов. Благодаря flatMap мы можем работать с
        // списком студентов через facultyList.

        Student st1 = new Student("Mariya", 'M', 22,3, 8.3);
        Student st2 = new Student("Nikolay", 'M', 28,2, 6.4);
        Student st3 = new Student("Elena", 'W', 19,1, 8.9);
        Student st4 = new Student("Petr", 'M', 35,4, 7);
        Student st5 = new Student("Bob", 'M', 22,3, 8.3);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("History");

        f1.addStudentsToFaculty(st1);
        f1.addStudentsToFaculty(st2);
        f1.addStudentsToFaculty(st3);
        f2.addStudentsToFaculty(st4);
        f2.addStudentsToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnfFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnfFaculty() {
        return studentsOnfFaculty;
    }

    public void addStudentsToFaculty (Student student) {
        studentsOnfFaculty.add(student);
    }

}