package BehavioralPattern.ChainOfResponsibilityPattern;

public abstract class Handler {
    private Handler successor;
    public Handler() {}
    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest() {
        if(successor != null)
            successor.handleRequest();
    }

    public boolean canHandleRequest() {
        return false;
    }

}
