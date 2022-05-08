package StructurePattern;

import StructurePattern.CompositePattern.BOM.*;
import StructurePattern.CompositePattern.Basic.Component;
import StructurePattern.CompositePattern.Basic.Composite;
import StructurePattern.CompositePattern.Basic.Leaf;
import org.junit.jupiter.api.Test;

class CompositePatternTest {
    @Test
    public void CompositePattern() {
        Component composite2 = new Composite("composite2 ");
        composite2.add(new Leaf("Leaf1 "));
        composite2.add(new Leaf("Leaf2 "));
        composite2.add(new Leaf("Leaf3 "));

        Component composite1 = new Composite("composite1 ");
        composite1.add(new Leaf("Leaf4 "));
        composite1.add(composite2);
        composite1.add(new Leaf("Leaf5 "));

        System.out.println("(1) " + composite1.operation());
        System.out.println("(2) " + composite2.operation());

    }

    @Test
    public void CompositePattern2() {
        Component2 mainBoard = new MainBoard("MainBoard", 100);
        mainBoard.add(new Processor("Processor", 100));
        mainBoard.add(new Memory("Memory", 100));
        Component2 chassis = new Chassis("Chassis  ", 100);
        chassis.add(mainBoard);
        chassis.add(new Disk("Disk        ", 100));

        System.out.println(chassis.getName() + " total price " + chassis.getPrice());
        System.out.println(mainBoard.getName() + " total price " + mainBoard.getPrice());

    }
}
