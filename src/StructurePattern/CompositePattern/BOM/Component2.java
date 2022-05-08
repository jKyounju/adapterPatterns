package StructurePattern.CompositePattern.BOM;

import java.util.Collections;
import java.util.Iterator;

public class Component2 {
    private String name;
    private long price;
    public Component2(String name, long price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public long getPrice() {
        return price;
    }
    public boolean add(Component2 c) {
        return false;
    }
    public Iterator<Component2> iterator() {
        return Collections.emptyIterator();
    }
    public int getChildCount() {
        return 0;
    }
}
