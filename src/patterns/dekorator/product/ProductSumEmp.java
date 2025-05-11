package patterns.dekorator.product;

public class ProductSumEmp implements Product{
    @Override
    public void display() {
        System.out.println("Класс сумма");
    }

    @Override
    public int getPrice(int a, int b) {
        return a + b;
    }
}
