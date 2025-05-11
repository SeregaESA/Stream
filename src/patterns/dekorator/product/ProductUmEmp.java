package patterns.dekorator.product;

public class ProductUmEmp implements Product{
    @Override
    public void display() {
        System.out.println("Класс умножения");
    }

    @Override
    public int getPrice(int a, int b) {
        return a * b;
    }
}
