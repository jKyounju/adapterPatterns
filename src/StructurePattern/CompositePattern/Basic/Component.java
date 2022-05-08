package StructurePattern.CompositePattern.Basic;

import java.util.Collections;
import java.util.Iterator;

public abstract class Component {
    private String name;
    public Component(String name) {
        this.name = name;
    }
    public abstract String operation();

    public String getName() {
        return name;
    }

    public boolean add(Component child) {
        return false;
    }
    public Iterator<Component> iterator() {
        return Collections.<Component>emptyIterator();
    }
}
