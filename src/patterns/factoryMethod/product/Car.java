package patterns.factoryMethod.product;

public class Car {
    String model;
    String color;

    public Car() {}

    public void setCar() {
        System.out.println("Саздаём машину класса: " + model +  "," + " цвета " + color);
    }

    public void newCar() {
        System.out.println("Создана машина класса: " + model + "," + " цвета " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
