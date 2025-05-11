package patterns.proxy;

public class UserProxy implements User{

    String name;
    String[] getFavoriteFood;

    private final User user = new UserExm();

    @Override
    public String getName() {
        name = user.getName();
        return name;
    }

    @Override
    public String[] getFavoriteFood() {
        getFavoriteFood = user.getFavoriteFood();
        return getFavoriteFood;
    }
}
