package StructurePattern.CompositePattern.Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends Component{

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public String operation() {
        Iterator<Component> it = children.iterator();
        String str = getName();
        Component child;
        while (it.hasNext()) {
            child = it.next();
            str += child.operation();
        }
        return str;
    }

    @Override
    public boolean add(Component child) {
        return children.add(child);
    }

    @Override
    public Iterator<Component> iterator() {
        return children.iterator();
    }
}
