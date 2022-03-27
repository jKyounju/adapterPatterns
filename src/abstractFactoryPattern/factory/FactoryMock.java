package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.*;

public class FactoryMock implements AbstractFactory {


    @Override
    public ProductA createProductA() {
        return new ProductAMock();
    }

    @Override
    public ProductB createProductB() {
        return new ProductBMock();
    }
}
