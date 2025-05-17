package patterns.singleton;

public class Test {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2.equals(s1));

    }
}
