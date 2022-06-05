package CreatationalPattern.AbstarctFactoryPattern.factory;

import CreatationalPattern.product.Product;

public interface AbstractFactory {

    public Product createProductA();
    public Product createProductB();
}
