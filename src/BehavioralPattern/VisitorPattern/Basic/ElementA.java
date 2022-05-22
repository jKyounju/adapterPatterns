package BehavioralPattern.VisitorPattern.Basic;

public class ElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    public String operationA() {
        return "Hello World from ElementA!";

    }
}
