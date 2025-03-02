package lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Poka");
        list.add("OK");
        list.add("Uchim Java");
        list.add("lambda");
        list.removeIf(element -> element.length() < 5);
        System.out.println(list);

    }
}
