package patterns.abstracFactory;

import patterns.abstracFactory.factory.Factory;
import patterns.abstracFactory.factory.FenderFactory;
import patterns.abstracFactory.factory.GibsonFactory;
import patterns.abstracFactory.factory.YamahaFactory;

public class Application {
    public void finishGuitar(int a) {

        Factory finishFactory = switch (a) {
            case 1 -> new GibsonFactory();
            case 2 -> new FenderFactory();
            case 3 -> new YamahaFactory();
            default -> null;
        };

        OrderGuitar orderGuitar = new OrderGuitar(finishFactory);

    }
}
