package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.ProductA;
import abstractFactoryPattern.product.ProductB;

public interface AbstractFactory {

    public ProductA createProductA();
    public ProductB createProductB();
}
