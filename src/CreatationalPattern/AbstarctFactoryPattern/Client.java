package CreatationalPattern.AbstarctFactoryPattern;

import CreatationalPattern.AbstarctFactoryPattern.factory.AbstractFactory;
import CreatationalPattern.product.Product;

public class Client {
    private Product productA;
    private Product productB;
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public String operation() {
        System.out.println("Client : Delegating creating objects to a factory object.");
        productA = factory.createProductA();
        productB = factory.createProductB();
        return "Hello " + productA.getName() +  " and " + productB.getName() + "!";
    }
}
