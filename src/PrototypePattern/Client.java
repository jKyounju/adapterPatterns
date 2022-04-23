package PrototypePattern;

import product.Product;

public class Client {

    private Product product;
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public String operation() {
        product = prototype.clone();
        return "Client : Cloning " + prototype.getClass().getSimpleName() + ".\n"
                + product.getName() + " object copied.";
    }

    public Product clone() {
        return this.prototype.clone();
    }
}
