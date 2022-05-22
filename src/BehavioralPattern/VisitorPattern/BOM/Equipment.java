package BehavioralPattern.VisitorPattern.BOM;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Equipment {
    private String name;
    List<Equipment> children = new ArrayList<>();
    public Equipment(String name) {
        this.name = name;
    }
    public abstract void accept(EquipmentVisitor v);

    public String getName() {
        return name;
    }

    public void add(Equipment e) {
        children.add(e);
    }

    public Iterator<Equipment> iterator() {
        return children.iterator();
    }

    public int getChildCount() {
        return children.size();
    }
}
