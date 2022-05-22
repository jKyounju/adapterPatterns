package BehavioralPattern.VisitorPattern.Basic;

public class ElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    public String operationB() {
        return "Hello World from ElementB!";
    }
}
