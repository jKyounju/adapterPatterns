package abstractFactoryPattern;

import abstractFactoryPattern.factory.AbstractFactory;
import abstractFactoryPattern.factory.FactoryMock;
import abstractFactoryPattern.factory.SingleTonFactory;
import org.junit.jupiter.api.Test;

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
}