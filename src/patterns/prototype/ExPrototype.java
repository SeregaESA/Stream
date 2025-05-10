package patterns.prototype;

import java.util.Objects;

public class ExPrototype extends Prototype{

    String pop;

    public ExPrototype(String prototype, int age, String lastName, String pop) {
        super(prototype, age, lastName);
        this.pop = pop;
    }

    public ExPrototype(ExPrototype prototype) {
        super(prototype);
        this.pop = prototype.pop;
    }

    @Override
    public Prototype clone() {
        return new ExPrototype(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExPrototype that)) return false;
        return Objects.equals(pop, that.pop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pop);
    }

    @Override
    public String toString() {
        return "ExPrototype{" +
                "pop='" + pop + '\'' +
                ", prototype='" + prototype + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
