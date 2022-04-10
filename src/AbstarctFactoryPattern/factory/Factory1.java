package AbstarctFactoryPattern.factory;

import product.ProductA1;
import product.Product;
import product.ProductB1;

public class Factory1 implements AbstractFactory {
    @Override
    public Product createProductA() {
        System.out.println("Factory1 : Creating a ProductA1 Object");
        return new ProductA1();
    }

    @Override
    public Product createProductB() {
        System.out.println("Factory1 : Creating a ProductB1 Object");
        return new ProductB1();
    }
}
