package patterns.fasad;

public class ComputerFasad {

    private Computer computer;

    public ComputerFasad(Computer computer) {
        this.computer = computer;
    }

    public void computerStart() {
        computer.pitanie();
        computer.proverca();
        computer.image();
    }

    public void computerStop() {
        computer.provercaOtrl();
        computer.imageOtrl();
        computer.pitanieOtrl();
    }

}
