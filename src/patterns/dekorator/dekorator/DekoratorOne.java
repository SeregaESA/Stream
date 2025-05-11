package patterns.dekorator.dekorator;

import patterns.dekorator.product.Product;

public class DekoratorOne implements Product {

    Product product;

    public DekoratorOne(Product product) {
        this.product = product;
    }

    @Override
    public void display() {
        System.out.println("Класс декоратора инкремент");
    }

    @Override
    public int getPrice(int a, int b) {
        System.out.println("Инкремент: " + (product.getPrice(a,b) + 1));
        return product.getPrice(a,b) + 1;
    }

}
