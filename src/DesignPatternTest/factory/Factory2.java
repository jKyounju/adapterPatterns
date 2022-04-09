package DesignPatternTest.factory;

import product.ProductA2;
import product.Product;
import product.ProductB2;

public class Factory2 implements AbstractFactory {

    private Product productA;
    private Product productB;

    @Override
    public Product createProductA() {
        System.out.println("AbstractFactoryPattern.factory.Factory2 : Creating a AbstractFactoryPattern.product.ProductA2 Object");
        return new ProductA2();
    }

    @Override
    public Product createProductB() {
        System.out.println("AbstractFactoryPattern.factory.Factory2 : Creating a AbstractFactoryPattern.product.ProductB2 Object");
        return new ProductB2();
    }
}
