package patterns.proxy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        UserProxy userProxy = new UserProxy();

        System.out.println(userProxy.name);
        System.out.println(Arrays.toString(userProxy.getFavoriteFood));

        System.out.println("-------------------------");

        userProxy.getName();
        userProxy.getFavoriteFood();

        System.out.println(userProxy.name);
        System.out.println(Arrays.toString(userProxy.getFavoriteFood));

    }
}
