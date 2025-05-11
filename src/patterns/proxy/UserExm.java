package patterns.proxy;

public class UserExm implements User {

    String name = "Sergei";
    String[] favoriteFood = {"Картошка", "Булка", "Каша"};

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String[] getFavoriteFood() {
        return favoriteFood;
    }
}
