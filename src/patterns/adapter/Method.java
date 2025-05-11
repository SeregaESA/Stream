package patterns.adapter;

import patterns.adapter.product.ProductOne;
import patterns.adapter.product.ProductOneEmp;
import patterns.adapter.productNext.ProductNextEmp;

public class Method {

    public ProductOne method(int a) {

        return switch (a) {
            case 1 -> new ProductOneEmp();
            case 2 -> new Adapter(new ProductNextEmp());
            default -> throw new IllegalStateException("Unexpected value: " + a);
        };
    }
}
