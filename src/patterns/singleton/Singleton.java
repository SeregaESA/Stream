package patterns.singleton;

import java.util.Objects;

class Singleton {

    private static Singleton instance;
    private final String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("Singleton");
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return Objects.equals(name, singleton.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
