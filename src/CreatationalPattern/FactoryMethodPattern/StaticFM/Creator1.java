package CreatationalPattern.FactoryMethodPattern.StaticFM;

import product.Product;
import product.Product1;

public class Creator1 {
    public static Product factoryMethod() {
        return new Product1();
    }
}
