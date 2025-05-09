package patterns.abstracFactory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.factory.Factory;
import patterns.abstracFactory.product.griff.Griff;

public class OrderGuitar {

    private Corpus orderCorpus;
    private Griff orderGriff;
    private Datchiki orderDatchiki;

    public OrderGuitar(Factory factory) {
        orderCorpus = factory.createCorpus();
        orderGriff = factory.createGriff();
        orderDatchiki = factory.createDatchiki();
    }

}
