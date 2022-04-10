package FactoryMethodPattern.StaticFM;

import product.Product;
import product.Product2;

public class Creator2 extends Creator1 {
    public static Product factoryMethod() {
        return new Product2();
    }
}
