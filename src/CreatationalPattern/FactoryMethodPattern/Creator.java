package CreatationalPattern.FactoryMethodPattern;

import CreatationalPattern.product.Product;

public abstract class Creator {
    private Product product;

    public abstract Product factoryMethod();

    public String operation() {
        product = factoryMethod();
        return "Hello World from "
                + this.getClass().getSimpleName() + "!\n"
                + product.getName() + " created.";
    }
}
