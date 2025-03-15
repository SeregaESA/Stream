package generics;

public class ParametrizeClass {
    public static void main(String[] args) {

// Опретор <> в правой части нужно ставить всегда, так как он указывает на левую часть. Указывает какой
// тип данных должен быть в списке. Если его не указать, то это будет "сырой тип" и в список можно будет
// положить любой тип, не зависимо от левой части.

        Info <String> infoString = new Info<>("String");
        System.out.println(infoString);
        infoString.setValue("dfdf");
        System.out.println(infoString);
        System.out.println("----------------------------------");

        Info <Integer> infoInteger = new Info<>(35);
        System.out.println(infoInteger);
        infoInteger.setValue(23);
        System.out.println(infoInteger);

    }
}

// Вместо T можно использовать любые значения, но принято:
// Е - при работе с элементами (ArrayList)
// K - при работе с ключами (Map)
// V - при работе с value (Map)

class Info <T> {

// Переменная value не может быть static
    private T value;

//  Можно все переменные сделать типом Т
    private T value2;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "Value: " + value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
