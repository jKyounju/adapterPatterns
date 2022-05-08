package StructurePattern;

import StructurePattern.DecoratorPattern.basic.*;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    public void DecoratorPatternTest() {
        DecoratorComponent component = new Component1();
        System.out.println("(1) " + component.operation());
        Decorator decorator = new Decorator1(new Decorator2(component));
        System.out.println("(2) " + decorator.operation());
    }
}
