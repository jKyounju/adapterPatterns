package abstractFactoryPattern;

import abstractFactoryPattern.factory.FactoryMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignPatternTest {

    @Test
    public void FactoryPattern() {
        Client client = new Client(new FactoryMock());
        System.out.println(client.operation());
    }

}