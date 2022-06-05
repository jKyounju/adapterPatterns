package CreatationalPattern.AbstarctFactoryPattern.factory;

import CreatationalPattern.product.ProductA2;
import CreatationalPattern.product.Product;
import CreatationalPattern.product.ProductB2;

import java.util.Objects;

public class Factory2 implements AbstractFactory {

    @Override
    public Product createProductA() {
        System.out.println("Factory2 : Creating a ProductA2 Object");
        return new ProductA2();
    }

    @Override
    public Product createProductB() {
        System.out.println("Factory2 : Creating a ProductB2 Object");
        return new ProductB2();
    }
}