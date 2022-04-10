package FactoryMethodPattern.AbstractFM;

import FactoryMethodPattern.Creator;
import product.Product;
import product.Product1;

public class Creator1 extends Creator {
    @Override
    public Product factoryMethod() {
        return new Product1();
    }
}
