package AbstarctFactoryPattern;

import BridgePattern.Abstraction;
import BridgePattern.Abstraction1;
import BridgePattern.Implementor1;
import BuilderPattern.*;
import AbstarctFactoryPattern.factory.FactoryMock;
import AbstarctFactoryPattern.factory.SingleTonFactory;
import CompositePattern.BOM.*;
import CompositePattern.Basic.Component;
import CompositePattern.Basic.Composite;
import CompositePattern.Basic.Leaf;
import FactoryMethodPattern.Creator;
import FactoryMethodPattern.AbstractFM.Creator1;
import PrototypePattern.Product1;
import ProxyPattern.Proxy;
import ProxyPattern.RealSubject;
import org.junit.jupiter.api.Test;
import product.Product;

import static FactoryMethodPattern.StaticFM.Creator2.factoryMethod;
import static org.junit.jupiter.api.Assertions.*;

class DesignPatternTest {

    @Test
    public void FactoryPattern() {
        Client client = new Client(new FactoryMock());
//        System.out.println(client.operation());
        assertEquals(client.operation(),
                "Hello ProductAMock and ProductBMock!");
    }

    @Test
    public void SingleTonFactoryTest() {
        Client2 client = new Client2(SingleTonFactory.getFactory3());
        Client2 client2 = new Client2(SingleTonFactory.getFactory4());

        assertEquals(client.operation(),
                "Hello AbstractFactoryPattern.product.ProductA1 and AbstractFactoryPattern.product.ProductB1!");
        assertEquals(client2.operation(),
                "Hello AbstractFactoryPattern.product.ProductA2 and AbstractFactoryPattern.product.ProductB2!");
    }

    @Test
    public void BuilderPatternTest() {
        Director director1 = new Director(new Builder1());
        Director2 director2 = new Director2.builder().complexObject(new ComplexObject()).build();
        System.out.println(director1.construct());

        assertEquals(director1.construct(), director2.construct());

    }

    @Test
    public void AbstractFactoryMethod() {
        Creator creator = new Creator1();
        var name = creator.factoryMethod().getName();

        assertEquals("Product1", name);
    }

    @Test
    public void StaticFactoryMethod() {
        Product product = factoryMethod();

        assertEquals("Product2", product.getName());
    }

    @Test
    public void PrototypePattern() {
        PrototypePattern.Client client = new PrototypePattern.Client(new Product1("Product1"));
        System.out.println(client.operation());

        Product p1 = client.clone();
        Product p2 = client.clone();

        assertEquals("false", String.valueOf(p1.equals(p2)));
    }

    @Test
    public void BridgePattern() {
        Abstraction abstraction = new Abstraction1(new Implementor1());
        System.out.println(abstraction.operation());
    }

    @Test
    public void ProxyPattern() {
        Proxy proxy = new Proxy(new RealSubject());
        System.out.println(proxy.operation());
    }

    @Test
    public void CompositePattern() {
        Component composite2 = new Composite("composite2 ");
        composite2.add(new Leaf("Leaf1 "));
        composite2.add(new Leaf("Leaf2 "));
        composite2.add(new Leaf("Leaf3 "));

        Component composite1 = new Composite("composite1 ");
        composite1.add(new Leaf("Leaf4 "));
        composite1.add(composite2);
        composite1.add(new Leaf("Leaf5 "));

        System.out.println("(1) " + composite1.operation());
        System.out.println("(2) " + composite2.operation());

    }

    @Test
    public void CompositePattern2() {
        Component2 mainboard = new MainBoard("MainBoard", 100);
        mainboard.add(new Processor("Processor", 100));
        mainboard.add(new Memory("Memory", 100));
        Component2 chassis = new Chassis("Chassis  ", 100);
        chassis.add(mainboard);
        chassis.add(new Disk("Disk        ", 100));

        System.out.println(chassis.getName() + " total price " + chassis.getPrice());
        System.out.println(mainboard.getName() + " total price " + mainboard.getPrice());

    }
}