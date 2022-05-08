package StructurePattern.CompositePattern.BOM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeComponent extends Component2 {
    private List<Component2> children = new ArrayList<>();
    public CompositeComponent(String name, long price) {
        super(name, price);
    }

    @Override
    public long getPrice() {
        long sum = 0;
        for(Component2 child : children) {
           sum += child.getPrice();
        }
        return sum;
    }

    @Override
    public boolean add(Component2 child) {
        return children.add(child);
    }

    @Override
    public Iterator<Component2> iterator() {
        return children.iterator();
    }

    @Override
    public int getChildCount() {
        return children.size();
    }
}
