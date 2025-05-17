package stream.intermediate;

import java.util.Objects;

public class StudentStream {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public StudentStream(String name,char sex, int age, int course, double avgGrade) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentStream student)) return false;
        return getSex() == student.getSex() && getAge() == student.getAge() && getCourse() == student.getCourse()
                && Double.compare(student.getAvgGrade(), getAvgGrade()) == 0 && Objects.equals(getName(),
                student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSex(), getAge(), getCourse(), getAvgGrade());
    }
}
