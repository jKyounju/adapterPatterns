package StructurePattern;

import StructurePattern.FacadePattern.*;
import org.junit.jupiter.api.Test;

public class FacadePatternTest {
    @Test
    public void facadePatternTest() {
        Facade facade = new Facade1(new Class1(), new Class2(), new Class3());
        System.out.println(facade.operation());
    }
}
