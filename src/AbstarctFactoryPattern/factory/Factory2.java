package AbstarctFactoryPattern.factory;

import product.ProductA2;
import product.Product;
import product.ProductB2;

public class Factory2 implements AbstractFactory {

    private Product productA;
    private Product productB;

    @Override
    public Product createProductA() {
        System.out.println("Factory2 : Creating a ProductA2 Object");
        return new ProductA2();
    }

    @Override
    public Product createProductB() {
        System.out.println("Factory2 : Creating a ProductB2 Object");
        return new ProductB2();
    }
}
