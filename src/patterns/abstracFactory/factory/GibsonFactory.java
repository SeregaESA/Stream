package patterns.abstracFactory.factory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.corpus.GibsonCorpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.product.datchiki.GibsonDatchiki;
import patterns.abstracFactory.product.griff.GibsonGriff;
import patterns.abstracFactory.product.griff.Griff;

public class GibsonFactory implements Factory{

    public GibsonFactory() {
        System.out.println("Создаём гитару Gibson");
    }

    @Override
    public Corpus createCorpus() {
        System.out.println("Корпус Gibson");
        return new GibsonCorpus();
    }

    @Override
    public Griff createGriff() {
        System.out.println("Гриф Gibson");
        return new GibsonGriff();
    }

    @Override
    public Datchiki createDatchiki() {
        System.out.println("Датчики Gibson");
        return new GibsonDatchiki();
    }
}
