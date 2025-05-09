package patterns.factoryMethod;

import patterns.factoryMethod.factory.FactoryCar;

public class Test {

    public static void main(String[] args) {

        FactoryCar factoryCar = new FactoryCar();
        factoryCar.createCar(1);

    }
}
