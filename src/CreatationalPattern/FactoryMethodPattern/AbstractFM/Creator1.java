package CreatationalPattern.FactoryMethodPattern.AbstractFM;

import CreatationalPattern.FactoryMethodPattern.Creator;
import CreatationalPattern.product.Product;
import CreatationalPattern.product.Product1;

public class Creator1 extends Creator {
    @Override
    public Product factoryMethod() {
        return new Product1();
    }
}
