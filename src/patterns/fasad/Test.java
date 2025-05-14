package patterns.fasad;

public class Test {
    public static void main(String[] args) {
        ComputerFasad computerFasad = new ComputerFasad(new Computer());

        computerFasad.computerStart();
        System.out.println("---------------");
        computerFasad.computerStop();

    }
}
