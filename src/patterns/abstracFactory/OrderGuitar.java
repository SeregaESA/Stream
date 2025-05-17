package patterns.abstracFactory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.factory.Factory;
import patterns.abstracFactory.product.griff.Griff;

public class OrderGuitar {

    public OrderGuitar(Factory factory) {
         factory.createCorpus();
         factory.createGriff();
         factory.createDatchiki();
    }
}
