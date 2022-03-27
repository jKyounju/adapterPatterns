package abstractFactoryPattern;

import abstractFactoryPattern.factory.AbstractFactory;
import abstractFactoryPattern.product.ProductA;
import abstractFactoryPattern.product.ProductB;

public class Client {
    private ProductA productA;
    private ProductB productB;
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public String operation() {
        System.out.println("AbstractFactoryPattern.Client : Delegating creating objects to a factory object.");
        productA = factory.createProductA();
        productB = factory.createProductB();
        return "Hello " + productA.getName() +  " and " + productB.getName() + "!";
    }
}
