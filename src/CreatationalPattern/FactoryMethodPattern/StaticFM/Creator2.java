package CreatationalPattern.FactoryMethodPattern.StaticFM;

import CreatationalPattern.product.Product;
import CreatationalPattern.product.Product2;

public class Creator2 extends Creator1 {
    public static Product factoryMethod() {
        return new Product2();
    }
}
