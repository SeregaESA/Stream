package patterns.dekorator;

import patterns.dekorator.dekorator.DekoratorOne;
import patterns.dekorator.dekorator.DekoratorTwo;
import patterns.dekorator.product.Product;
import patterns.dekorator.product.ProductSumEmp;
import patterns.dekorator.product.ProductUmEmp;

public class Test {

    public static void main(String[] args) {

        Product productSum = new ProductSumEmp();

        productSum.display();
        System.out.println(productSum.getPrice(2,3));

        System.out.println("----------------------------");

        Product productUm = new ProductUmEmp();
        productUm.display();
        System.out.println(productUm.getPrice(2,3));

        System.out.println("----------------------------");

        Product productDekoratorOne = new DekoratorOne(new ProductSumEmp());
        productDekoratorOne.display();
        productDekoratorOne.getPrice(2,3);

        System.out.println("----------------------------");

        Product productDekoratorTwo = new DekoratorTwo(new ProductUmEmp());
        productDekoratorTwo.display();
        productDekoratorTwo.getPrice(2,3);

    }

}
