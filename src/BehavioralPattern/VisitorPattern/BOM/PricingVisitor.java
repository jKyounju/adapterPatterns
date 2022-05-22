package BehavioralPattern.VisitorPattern.BOM;

import StructurePattern.CompositePattern.BOM.*;

public class PricingVisitor extends EquipmentVisitor {
    private int count = 0;
    private long sum = 0;
    @Override
    public void visitChassis(Chassis e) {
        count++;
        sum += e.getPrice();
    }

    @Override
    public void visitMainBoard(MainBoard e) {
        count++;
        sum += e.getPrice();
    }

    @Override
    public void visitProcessor(Processor e) {
        count++;
        sum += e.getPrice();
    }

    @Override
    public void visitMemory(Memory e) {
        count++;
        sum += e.getPrice();
    }

    @Override
    public void visitDisk(Disk e) {
        count++;
        sum += e.getPrice();
    }

    public int getCount() {
        return count;
    }

    public long getSum() {
        return sum;
    }
}
