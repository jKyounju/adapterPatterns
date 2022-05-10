package BehavioralPattern;

import BehavioralPattern.ChainOfResponsibilityPattern.Handler;
import BehavioralPattern.ChainOfResponsibilityPattern.Receiver1;
import BehavioralPattern.ChainOfResponsibilityPattern.Receiver2;
import BehavioralPattern.ChainOfResponsibilityPattern.Receiver3;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityTest() {
        Handler handler = new Receiver1(new Receiver2(new Receiver3()));

        System.out.println("Issuing a request to a handler object ... ");
        handler.handleRequest();
    }
}
