package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar = new Schoolar("Мария", 35);
        Schoolar schoolar2 = new Schoolar("Иван", 46);

        Student student = new Student("Николай", 26);
        Student student2 = new Student("Ксения", 23);

        Employee employee = new Employee("Сергей", 45);
        Employee employee2 = new Employee("Натали", 42);

        Team<Schoolar> schoolarTeam = new Team<>("Школьники");
        schoolarTeam.addNewIgroki(schoolar);
        schoolarTeam.addNewIgroki(schoolar2);
        Team<Schoolar> schoolarTeam2 = new Team<>("Школьники 2");
        schoolarTeam.addNewIgroki(schoolar);
        schoolarTeam.addNewIgroki(schoolar2);

        Team<Student> studentTeam = new Team<>("Студенты");
        studentTeam.addNewIgroki(student);
        studentTeam.addNewIgroki(student2);

        Team<Employee> employeeTeam = new Team<>("Работники");
        employeeTeam.addNewIgroki(employee);
        employeeTeam.addNewIgroki(employee2);
        System.out.println("--------------------");

//      Вызов метода playWhith

        schoolarTeam.playWhith(schoolarTeam2);

    }
}
