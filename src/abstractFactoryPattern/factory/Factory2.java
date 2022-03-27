package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.ProductA;
import abstractFactoryPattern.product.ProductA2;
import abstractFactoryPattern.product.ProductB;
import abstractFactoryPattern.product.ProductB2;

public class Factory2 implements AbstractFactory {

    private ProductA productA;
    private ProductB productB;

    @Override
    public ProductA createProductA() {
        System.out.println("AbstractFactoryPattern.factory.Factory2 : Creating a AbstractFactoryPattern.product.ProductA2 Object");
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        System.out.println("AbstractFactoryPattern.factory.Factory2 : Creating a AbstractFactoryPattern.product.ProductB2 Object");
        return new ProductB2();
    }
}
