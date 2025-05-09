package patterns.builder;

public class NewBurgerBuilder implements BurgerBuilder {

    private String bulka;
    private String cotleta;
    private String sous;
    private String componenty;

    public NewBurgerBuilder() {
    }

    @Override
    public BurgerBuilder rezBulca() {
        System.out.println("Булка new");
        this.bulka = "new bulca";
        return this;
    }

    @Override
    public BurgerBuilder polCotleta() {
        System.out.println("Котлета new");
        this.cotleta = "new cotleta";
        return this;
    }

    @Override
    public BurgerBuilder polSous() {
        System.out.println("Соус new");
        this.sous = "new sous";
        return this;
    }

    @Override
    public BurgerBuilder polComponenty() {
        System.out.println("Компоненты new");
        this.componenty = "new Componenty";
        return this;
    }

    @Override
    public Burger build() {
        Burger newBurger = new Burger(bulka, cotleta, sous, componenty);
        return newBurger;
    }
}
