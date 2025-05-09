package patterns.abstracFactory.factory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.product.griff.Griff;

public interface Factory {

    Corpus createCorpus();
    Griff createGriff();
    Datchiki createDatchiki();

}
