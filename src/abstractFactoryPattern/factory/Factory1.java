package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.ProductA;
import abstractFactoryPattern.product.ProductA1;
import abstractFactoryPattern.product.ProductB;
import abstractFactoryPattern.product.ProductB1;

public class Factory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        System.out.println("AbstractFactoryPattern.factory.Factory1 : Creating a AbstractFactoryPattern.product.ProductA1 Object");
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("AbstractFactoryPattern.factory.Factory1 : Creating a AbstractFactoryPattern.product.ProductB1 Object");
        return new ProductB1();
    }
}
