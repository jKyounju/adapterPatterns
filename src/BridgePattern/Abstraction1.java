package BridgePattern;

public class Abstraction1 implements Abstraction {

    private Implementor imp;

    public Abstraction1(Implementor imp) {
        this.imp = imp;
    }

    @Override
    public String operation() {
        return "Abstraction1: Delegating implementation to an implementor.\n"
                + imp.operationImp();
    }
}
