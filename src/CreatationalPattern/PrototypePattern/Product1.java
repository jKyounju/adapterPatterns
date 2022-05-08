package CreatationalPattern.PrototypePattern;

import product.Product;

public class Product1 implements Prototype, Product {

    String name;

    public Product1(String name) {
        this.name = name;
    }

    public Product1(Product1 p) {
        this.name = p.getName();
    }

    @Override
    public Product clone() {
        return new Product1(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
