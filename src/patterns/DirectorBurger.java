package patterns;

public class DirectorBurger {

    private BurgerBuilder burgerBuilder;

    public DirectorBurger(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Burger createBurger() {
        return burgerBuilder.rezBulca().polCotleta().polSous().polComponenty().build();
    }
}
