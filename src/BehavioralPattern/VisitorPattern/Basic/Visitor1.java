package BehavioralPattern.VisitorPattern.Basic;

public class Visitor1 extends Visitor {
    @Override
    public void visitElementA(ElementA e) {
        System.out.println("Visit1: Visiting (doing something on) ElementA. \n" +
                e.operationA());
    }

    @Override
    public void visitElementB(ElementB e) {
        System.out.println("Visit1: Visiting (doing something on) ElementB. \n" +
                e.operationB());
    }
}
