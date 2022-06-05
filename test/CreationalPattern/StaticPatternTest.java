package CreationalPattern;

import org.junit.jupiter.api.Test;
import CreatationalPattern.product.Product;

import static CreatationalPattern.FactoryMethodPattern.StaticFM.Creator2.factoryMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticPatternTest {
    @Test
    public void StaticFactoryMethod() {
        Product product = factoryMethod();

        assertEquals("Product2", product.getName());
    }
}
