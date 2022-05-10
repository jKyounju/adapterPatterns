package BehavioralPattern.ChainOfResponsibilityPattern;

public class Receiver3 extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("Receiver3 : Handling the request ...");
    }
}
