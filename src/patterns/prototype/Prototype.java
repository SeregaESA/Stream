package patterns.prototype;

public abstract class Prototype {

    String prototype;
    int age;
    String lastName;

    public Prototype(Prototype prototype) {
        this.prototype = prototype.prototype;
        this.age = prototype.age;
        this.lastName = prototype.lastName;
    }

    public Prototype(String prototype, int age, String lastName) {
        this.prototype = prototype;
        this.age = age;
        this.lastName = lastName;
    }

    public abstract Prototype clone();

    @Override
    public String toString() {
        return "Prototype{" +
                "prototype='" + prototype + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
