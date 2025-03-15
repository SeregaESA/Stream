package generics.igra;

public abstract class Igroki {

    private String name;
    private int age;

    public Igroki(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
