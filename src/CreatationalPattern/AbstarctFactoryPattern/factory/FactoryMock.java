package CreatationalPattern.AbstarctFactoryPattern.factory;

import CreatationalPattern.product.Product;
import CreatationalPattern.product.ProductAMock;
import CreatationalPattern.product.ProductBMock;

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
