package patterns;

public interface BurgerBuilder {
    BurgerBuilder rezBulca();
    BurgerBuilder polCotleta();
    BurgerBuilder polSous();
    BurgerBuilder polComponenty();
    Burger build();
}
