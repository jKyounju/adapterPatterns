package StructurePattern.CompositePattern.Basic;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return getName();
    }
}
