package patterns.adapter;

import patterns.adapter.product.ProductOne;
import patterns.adapter.productNext.ProductNext;

public class Adapter implements ProductOne {
    ProductNext productNext;

    public Adapter(ProductNext productNext) {
        this.productNext = productNext;
    }

    @Override
    public void lineOne() {
        productNext.productNextOne();
    }

    @Override
    public void lineTwo() {
        productNext.productNextTwo();
    }
}
