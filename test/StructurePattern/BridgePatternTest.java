package StructurePattern;

import StructurePattern.BridgePattern.Abstraction;
import StructurePattern.BridgePattern.Abstraction1;
import StructurePattern.BridgePattern.Implementor1;
import org.junit.jupiter.api.Test;

class BridgePatternTest {

    @Test
    public void BridgePattern() {
        Abstraction abstraction = new Abstraction1(new Implementor1());
        System.out.println(abstraction.operation());
    }
}
