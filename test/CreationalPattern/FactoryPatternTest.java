package CreationalPattern;

import CreatationalPattern.AbstarctFactoryPattern.Client;
import CreatationalPattern.AbstarctFactoryPattern.factory.FactoryMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryPatternTest {
    @Test
    public void FactoryPattern() {
        Client client = new Client(new FactoryMock());
//        System.out.println(client.operation());
        assertEquals(client.operation(),
                "Hello ProductAMock and ProductBMock!");
    }
}
