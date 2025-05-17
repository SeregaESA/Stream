package stream.intermediate;

import java.util.ArrayList;
import java.util.List;

public class methodFlatMap {
    public static void main(String[] args) {

        // Метод flatMap (промежуточный) даёт возможность создать стрим из вложенного списка. На примере - facultyList содержит
        // список факультетов, а в факультетах есть еще списки студентов. Благодаря flatMap мы можем работать с
        // списком студентов через facultyList.

        StudentStream st1 = new StudentStream("Mariya", 'M', 22,3, 8.3);
        StudentStream st2 = new StudentStream("Nikolay", 'M', 28,2, 6.4);
        StudentStream st3 = new StudentStream("Elena", 'W', 19,1, 8.9);
        StudentStream st4 = new StudentStream("Petr", 'M', 35,4, 7);
        StudentStream st5 = new StudentStream("Bob", 'M', 22,3, 8.3);

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
    List<StudentStream> studentsOnfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnfFaculty = new ArrayList<>();
    }

    public List<StudentStream> getStudentsOnfFaculty() {
        return studentsOnfFaculty;
    }

    public void addStudentsToFaculty (StudentStream student) {
        studentsOnfFaculty.add(student);
    }

}