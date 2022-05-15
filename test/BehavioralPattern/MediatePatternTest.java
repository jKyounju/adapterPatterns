package BehavioralPattern;

import BehavioralPattern.MediatePattern.Colleague1;
import BehavioralPattern.MediatePattern.Colleague2;
import BehavioralPattern.MediatePattern.Mediator1;
import org.junit.jupiter.api.Test;

public class MediatePatternTest {

    @Test
    public void mediatePatternTest() {
        Mediator1 mediate = new Mediator1();
        Colleague1 colleague1 = new Colleague1(mediate);
        Colleague2 colleague2 = new Colleague2(mediate);

        mediate.setColleague(colleague1, colleague2);

        System.out.println("(1) Changing state of Colleague1 ...");
        colleague1.setState("Hello World1");

        System.out.println("(2) Changing state of Colleague2 ...");
        colleague2.setState("Hello World2");
    }

}
