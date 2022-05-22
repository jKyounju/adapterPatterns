package BehavioralPattern.VisitorPattern.BOM;

import StructurePattern.CompositePattern.BOM.*;

public abstract class EquipmentVisitor {
    public abstract void visitChassis(Chassis e);
    public abstract void visitMainBoard(MainBoard e);
    public abstract void visitProcessor(Processor e);
    public abstract void visitMemory(Memory e);
    public abstract void visitDisk(Disk e);
}
