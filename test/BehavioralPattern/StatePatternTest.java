package BehavioralPattern;

import BehavioralPattern.StatePattern.Basic.Context;
import BehavioralPattern.StatePattern.Basic.State1;
import BehavioralPattern.StatePattern.TCP.Closed;
import BehavioralPattern.StatePattern.TCP.Connection1;
import org.junit.jupiter.api.Test;

import java.io.OutputStream;

public class StatePatternTest {

    @Test
    public void statePatternTest() {
        Context context = new Context(State1.getInstance());
        System.out.println("(1) " + context.operation());
        System.out.println("(2) " + context.operation());
    }

    @Test
    public void stateTCPTest() {
        OutputStream data = null;
        Connection1 c = new Connection1(Closed.getInstance());
        c.open();
        c.transmit(data);
        c.close();
    }
}
