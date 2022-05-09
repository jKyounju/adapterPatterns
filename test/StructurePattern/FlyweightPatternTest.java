package StructurePattern;

import StructurePattern.FlyweightPattern.Flyweight;
import StructurePattern.FlyweightPattern.Flyweight1;
import StructurePattern.FlyweightPattern.FlyweightFactory;
import org.junit.jupiter.api.Test;

public class FlyweightPatternTest {
    @Test
    public void flyweightPatternTest() {
        Flyweight flyweight;
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight.operation(100));

        flyweight = flyweightFactory.getFlyweight("A");
        System.out.println(flyweight.operation(200));

        System.out.println("\n*** Number of flyweights created: "
                + flyweightFactory.getSize() + " ***");
    }
}
