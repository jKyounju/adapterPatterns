package BehavioralPattern;

import BehavioralPattern.MementoPattern.Originator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MementoPatternTest {

    @Test
    public void mementoPatternTest() {
        Originator originator = new Originator();

        Originator.Memento memento;

        List<Originator.Memento> mementos = new ArrayList<>();

        originator.setState("A");
        memento = originator.createMemento();
        mementos.add(memento);
        System.out.println("(1) Saving current state ...... : " + originator.getState());

        originator.setState("B");
        memento = originator.createMemento();
        mementos.add(memento);
        System.out.println("(2) Saving current state ...... : " + originator.getState());

        memento = mementos.get(0);
        originator.restore(memento);
        System.out.println("(3) Restoring to previous state : " + originator.getState());
    }
}
