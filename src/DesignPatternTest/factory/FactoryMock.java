package DesignPatternTest.factory;

import product.*;

public class FactoryMock implements AbstractFactory {


    @Override
    public Product createProductA() {
        return new ProductAMock();
    }

    @Override
    public Product createProductB() {
        return new ProductBMock();
    }
}
