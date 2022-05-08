package StructurePattern.DecoratorPattern.basic;

public class Decorator1 extends Decorator {
    private DecoratorComponent component;

    public Decorator1(DecoratorComponent component) {
        super(component);
    }

    @Override
    public String operation() {
        String result = super.operation();
        return addBehavior(result);
    }

    private String addBehavior(String result) {
        return "***" + result + "***";
    }
}
