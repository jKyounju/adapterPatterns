package AbstarctFactoryPattern;

import BuilderPattern.*;
import AbstarctFactoryPattern.factory.FactoryMock;
import AbstarctFactoryPattern.factory.SingleTonFactory;
import FactoryMethodPattern.Creator;
import FactoryMethodPattern.AbstractFM.Creator1;
import PrototypePattern.Product1;
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
}