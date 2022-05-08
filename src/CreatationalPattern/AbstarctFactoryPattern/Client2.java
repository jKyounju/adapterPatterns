package CreatationalPattern.AbstarctFactoryPattern;

import CreatationalPattern.AbstarctFactoryPattern.factory.SingleTonFactory;
import product.Product;

public class Client2 {
    private Product productA;
    private Product productB;
    private SingleTonFactory factory;

    public Client2(SingleTonFactory factory) {
        this.factory = factory;
    }

    public String operation() {
        System.out.println("AbstractFactoryPattern.Client : Delegating creating objects to a factory object.");
        productA = factory.createProductA();
        productB = factory.createProductB();
        return "Hello " + productA.getName() +  " and " + productB.getName() + "!";
    }
}
