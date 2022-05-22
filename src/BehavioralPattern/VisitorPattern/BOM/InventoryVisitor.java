package BehavioralPattern.VisitorPattern.BOM;

import StructurePattern.CompositePattern.BOM.*;

public class InventoryVisitor extends EquipmentVisitor {
    private Inventory inventory;
    public InventoryVisitor(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void visitChassis(Chassis e) {
        System.out.println("Inventory for " + e.getName() +": " +e.getChildCount());
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        System.out.println("Inventory for " + e.getName() +": " +e.getChildCount());
    }

    @Override
    public void visitProcessor(Processor e) {
        System.out.println("Inventory for " + e.getName() +": " +e.getChildCount());
    }

    @Override
    public void visitMemory(Memory e) {
        System.out.println("Inventory for " + e.getName() +": " +e.getChildCount());
    }

    @Override
    public void visitDisk(Disk e) {
        System.out.println("Inventory for " + e.getName() +": " +e.getChildCount());
    }
}
