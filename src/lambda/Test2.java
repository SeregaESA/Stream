package lambda;

public class Test2 {

    static void def(I i) {
        System.out.println(i.abc("privet"));
    }

    static void der(J j) {
        System.out.println(j.abc());
    }

    public static void main(String[] args) {
        int i = 10;
        // Можно внутри ЛВ использовать переменные. Такие переменные должны быть final или не меняться вообще
        def((String s) -> s.length());
        def(String::hashCode);
        def((String s) -> s.length() + i);

        // Если в методе интерфейса нет параметров, то запись такая
        der(() -> 15);

    }
}

interface I {
    int abc(String s);
}

interface J {
    int abc();
}
