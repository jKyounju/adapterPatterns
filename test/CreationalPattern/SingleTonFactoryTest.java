package CreationalPattern;

import CreatationalPattern.AbstarctFactoryPattern.Client2;
import CreatationalPattern.AbstarctFactoryPattern.factory.SingleTonFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleTonFactoryTest {
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
