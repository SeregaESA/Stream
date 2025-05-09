package patterns.abstracFactory.factory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.corpus.FenderCorpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.product.datchiki.FenderDatchiki;
import patterns.abstracFactory.product.griff.FenderGriff;
import patterns.abstracFactory.product.griff.Griff;

public class FenderFactory implements Factory{

    public FenderFactory() {
        System.out.println("Создаём гитару Fender");
    }

    @Override
    public Corpus createCorpus() {
        System.out.println("Корпус Fender");
        return new FenderCorpus();
    }

    @Override
    public Griff createGriff() {
        System.out.println("Гриф Fender");
        return new FenderGriff();
    }

    @Override
    public Datchiki createDatchiki() {
        System.out.println("Датчик Fender");
        return new FenderDatchiki();
    }
}
