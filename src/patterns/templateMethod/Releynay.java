package patterns.templateMethod;

public abstract class Releynay {

    abstract void stativ();
    abstract void montach();
    abstract void oborudovanye();

    final void createReleynaya() {
        pomechenie();
        stativ();
        montach();
        oborudovanye();
        po();
    }

    void pomechenie() {
        System.out.println("Выбираем помещение");
    }

    void po() {

    }

}
