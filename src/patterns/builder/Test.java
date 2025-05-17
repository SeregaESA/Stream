package patterns.builder;

public class Test {
    public static void main(String[] args) {

        BurgerBuilder burgerBuilder = new NewBurgerBuilder();

        DirectorBurger directorBurger = new DirectorBurger(burgerBuilder);
        Burger burger = directorBurger.createBurger();
        System.out.println(burger);

    }
}
