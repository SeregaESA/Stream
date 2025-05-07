package patterns;

public class ClassicBurgerBilder implements BurgerBuilder {

    private String bulka;
    private String cotleta;
    private String sous;
    private String componenty;

    public ClassicBurgerBilder() {
    }

    @Override
    public BurgerBuilder rezBulca() {

        System.out.println("Булка классик");
        this.bulka = "Classic bulca";
        return this;
    }

    @Override
    public BurgerBuilder polCotleta() {

        System.out.println("Котлета классик");
        this.cotleta = "Classic cotleta";
        return this;

    }

    @Override
    public BurgerBuilder polSous() {
        System.out.println("Соус классик");
        this.sous = "Classic sous";
        return this;
    }

    @Override
    public BurgerBuilder polComponenty() {
        System.out.println("Компоненты классик");
        this.componenty = "Classic Componenty";
        return this;
    }

    @Override
    public Burger build() {
        Burger classicBurger = new Burger(bulka, cotleta, sous, componenty);
        return classicBurger;
    }
}
