package BehavioralPattern;

import BehavioralPattern.VisitorPattern.BOM.EquipmentVisitor;
import BehavioralPattern.VisitorPattern.BOM.InventoryVisitor;
import BehavioralPattern.VisitorPattern.BOM.PricingVisitor;
import BehavioralPattern.VisitorPattern.Basic.*;
import StructurePattern.CompositePattern.BOM.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternTest {
    @Test
    public void visitorPatternTest() {
        List<Element> elements = new ArrayList<>();
        elements.add(new ElementA());
        elements.add(new ElementB());
        Visitor visitor = new Visitor1();
        for(Element e : elements) {
            e.accept(visitor);
        }
    }
}
