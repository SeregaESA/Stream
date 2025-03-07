package lambda;

public class Student {

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
