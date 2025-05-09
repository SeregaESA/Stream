package patterns.factoryMethod.factory;

import patterns.factoryMethod.product.Car;
import patterns.factoryMethod.product.NewCar;
import patterns.factoryMethod.product.TrucCar;

public  class FactoryCar {

    public Car createCar(int number) {

        Car car = typeCar(number);

        car.setCar();
        car.newCar();
        System.out.println("Ваша машина готова, спасибо");

        return car;
    }

    public Car typeCar(int numberType) {
        return switch (numberType) {
            case 1 -> new TrucCar("Red");
            case 2 -> new NewCar("Blue");
            default -> null;
        };
    }
}
