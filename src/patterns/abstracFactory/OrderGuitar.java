package patterns.abstracFactory;

import patterns.abstracFactory.factory.Factory;

public class OrderGuitar {

    public OrderGuitar(Factory factory) {
        factory.createCorpus();
        factory.createGriff();
        factory.createDatchiki();
    }
}
