package generics;

import java.util.Objects;

public class ParametrizeClass2 {
    public static void main(String[] args) {

        Pair<String, Integer, Integer> pair = new Pair<>("Pop", 35,26);
        System.out.println(pair);

        Pair<Integer, Integer, Double> pair1 = new Pair<>(35, 85, 25.2);
        System.out.println(pair1);

    }
}

// Можно использовать несколько парраметров
class Pair<V1, V2, V3> {
    public V1 first;
    public V2 second;
    public V3 third;

    public Pair(V1 first, V2 second, V3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public V1 getFirst() {
        return first;
    }

    public V2 getSecond() {
        return second;
    }

    public V3 getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?, ?> pair = (Pair<?, ?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second) && Objects.equals(third, pair.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }
}
