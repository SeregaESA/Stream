package patterns.prototype;

public class Test {
    public static void main(String[] args) {

        Prototype exPrototype = new ExPrototype("Sergei", 30, "Ermolaev", "Rock");

        Prototype cloneExPrototype = exPrototype.clone();
        cloneExPrototype.age = 45;

        System.out.println(exPrototype.toString());
        System.out.println(cloneExPrototype.toString());

    }

}
