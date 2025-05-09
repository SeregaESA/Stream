package patterns.builder;

public interface BurgerBuilder {
    BurgerBuilder rezBulca();
    BurgerBuilder polCotleta();
    BurgerBuilder polSous();
    BurgerBuilder polComponenty();
    Burger build();
}
