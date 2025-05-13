package patterns.templateMethod;

public class MrcReleynay extends Releynay {
    @Override
    void stativ() {
        System.out.println("Установка стативов под реле");
    }

    @Override
    void montach() {
        System.out.println("Запайка монтажа на стативы");
    }

    @Override
    void oborudovanye() {
        System.out.println("Установка реле согласно схем");
    }
}
