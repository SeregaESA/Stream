package patterns.adapter.product;

public class ProductOneEmp implements ProductOne {
    @Override
    public void lineOne() {
        System.out.println("Главный продукт lineOne");
    }

    @Override
    public void lineTwo() {
        System.out.println("Главный продукт lineTwo");
    }
}
