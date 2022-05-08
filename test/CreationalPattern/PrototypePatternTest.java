package CreationalPattern;

import CreatationalPattern.PrototypePattern.Product1;
import org.junit.jupiter.api.Test;
import product.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrototypePatternTest {
    @Test
    public void PrototypePattern() {
        CreatationalPattern.PrototypePattern.Client client = new CreatationalPattern.PrototypePattern.Client(new Product1("Product1"));
        System.out.println(client.operation());

        Product p1 = client.clone();
        Product p2 = client.clone();

        assertEquals("false", String.valueOf(p1.equals(p2)));
    }
}
