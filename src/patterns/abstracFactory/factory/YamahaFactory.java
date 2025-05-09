package patterns.abstracFactory.factory;

import patterns.abstracFactory.product.corpus.Corpus;
import patterns.abstracFactory.product.corpus.YamahaCorpus;
import patterns.abstracFactory.product.datchiki.Datchiki;
import patterns.abstracFactory.product.datchiki.YamahaDatchiki;
import patterns.abstracFactory.product.griff.Griff;
import patterns.abstracFactory.product.griff.YamahaGriff;

public class YamahaFactory implements Factory{

    public YamahaFactory() {
        System.out.println("Создаём гитару Yamaha");
    }

    @Override
    public Corpus createCorpus() {
        System.out.println("Корпус Yamaha");
        return new YamahaCorpus();
    }

    @Override
    public Griff createGriff() {
        System.out.println("Гриф Yamaha");
        return new YamahaGriff();
    }

    @Override
    public Datchiki createDatchiki() {
        System.out.println("Датчики Yamaha");
        return new YamahaDatchiki();
    }
}
