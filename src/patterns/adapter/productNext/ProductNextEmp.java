package patterns.adapter.productNext;

public class ProductNextEmp implements ProductNext {
    @Override
    public void productNextOne() {
        System.out.println("Дополнительный продукт productNextOne");
    }

    @Override
    public void productNextTwo() {
        System.out.println("Дополнительный продукт productNextTwo");
    }
}
