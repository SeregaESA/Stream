package patterns.dekorator.dekorator;

import patterns.dekorator.product.Product;

public class DekoratorTwo implements Product {

    Product product;

    public DekoratorTwo(Product product) {
        this.product = product;
    }

    @Override
    public void display() {
        System.out.println("Класс второго декоратора");
    }

    @Override
    public int getPrice(int a, int b) {
        System.out.println("Результат второго дикоратора: " + product.getPrice(a,b));
        return product.getPrice(a,b);
    }
}
