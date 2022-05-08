package StructurePattern.DecoratorPattern.basic;

public class Decorator extends Component1 {
    private DecoratorComponent component;

    public Decorator(DecoratorComponent component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return super.operation();
    }
}
