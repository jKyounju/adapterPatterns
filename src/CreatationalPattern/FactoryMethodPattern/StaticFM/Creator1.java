package CreatationalPattern.FactoryMethodPattern.StaticFM;

import CreatationalPattern.product.Product;
import CreatationalPattern.product.Product1;

public class Creator1 {
    public static Product factoryMethod() {
        return new Product1();
    }
}
