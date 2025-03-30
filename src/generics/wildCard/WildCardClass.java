package generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildCardClass {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        List <A> listA = new ArrayList<>();
        List <B> listB = new ArrayList<>();
        List <C> listC = new ArrayList<>();
        List <D> listD = new ArrayList<>();
        List <E> listE = new ArrayList<>();

        pop(listA);

    }

    static void pop (List<? super C> classB) {
//        generics.wildCard.C c = classB.get(0);
//        generics.wildCard.A a = classB.get(1);
//        generics.wildCard.B b = classB.get(2);

        classB.add(new C());
        classB.add(new D());
        classB.add(new E());

    }

    static void pop1 (List<? extends C> classB1) {
        C c = classB1.get(0);
        A a = classB1.get(1);
        B b = classB1.get(2);
    }

    static void pop3 (List<C> classB3) {
        C c = classB3.get(0);
        A a = classB3.get(1);
        B b = classB3.get(2);
        classB3.add(new C());
        classB3.add(new D());
        classB3.add(new E());
    }
}

class A {}

class B extends A {}

class C extends B {}

class D extends C {}

class E extends D {}
