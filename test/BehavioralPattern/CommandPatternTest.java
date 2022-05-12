package BehavioralPattern;

import BehavioralPattern.CommandPattern.Command;
import BehavioralPattern.CommandPattern.Command1;
import BehavioralPattern.CommandPattern.Invoker;
import BehavioralPattern.CommandPattern.Receiver1;
import org.junit.jupiter.api.Test;

public class CommandPatternTest {

    @Test
    public void commandPatternTest() {
        Command command = new Command1(new Receiver1());
        Invoker invoker = new Invoker(command);

        invoker.operation();
    }
}
