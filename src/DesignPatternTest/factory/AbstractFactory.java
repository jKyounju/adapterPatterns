package DesignPatternTest.factory;

import product.Product;

public interface AbstractFactory {

    public Product createProductA();
    public Product createProductB();
}
