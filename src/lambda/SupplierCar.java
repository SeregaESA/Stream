package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierCar {

    // Supplier с метод get поставляет объекты в наш ArrayList
    public static ArrayList<Car> creatThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

// ИСпользование Consumer

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }


    public static void main(String[] args) {

        ArrayList<Car> ourCars = creatThreeCars(() ->
                new Car("Honda", 1.6, "Black"));
        System.out.println("Our Cars: " + ourCars);

        changeCar(ourCars.get(0),
                car -> {
                    {
                        car.color = "red";
                        car.engine = 2.0;
                        System.out.println("upgraded car: " + car);
                    }
                });
        System.out.println("Our Cars: " + ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, double engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}