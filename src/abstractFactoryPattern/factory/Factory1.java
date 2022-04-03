package abstractFactoryPattern.factory;

import product.ProductA1;
import product.Product;
import product.ProductB1;

public class Factory1 implements AbstractFactory {
    @Override
    public Product createProductA() {
        System.out.println("AbstractFactoryPattern.factory.Factory1 : Creating a AbstractFactoryPattern.product.ProductA1 Object");
        return new ProductA1();
    }

    @Override
    public Product createProductB() {
        System.out.println("AbstractFactoryPattern.factory.Factory1 : Creating a AbstractFactoryPattern.product.ProductB1 Object");
        return new ProductB1();
    }
}
