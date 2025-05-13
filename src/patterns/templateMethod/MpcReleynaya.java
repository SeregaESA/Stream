package patterns.templateMethod;

public class MpcReleynaya extends Releynay{

    @Override
    void stativ() {
        System.out.println("Установка шкафов МПЦ");
    }

    @Override
    void montach() {
        System.out.println("Установка корзин под платы");
    }

    @Override
    void oborudovanye() {
        System.out.println("Установка плат МПЦ");
    }

    @Override
    void po() {
        System.out.println("Настройка ПО для станции");
    }
}
