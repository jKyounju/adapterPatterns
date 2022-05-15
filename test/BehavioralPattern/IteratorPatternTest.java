package BehavioralPattern;

import BehavioralPattern.IteratorPattern.Aggregate;
import BehavioralPattern.IteratorPattern.Aggregate1;
import BehavioralPattern.IteratorPattern.Iterator;
import org.junit.jupiter.api.Test;

public class IteratorPatternTest {

    @Test
    public void iteratorPatternTest() {
        Aggregate<String> aggregate = new Aggregate1<>(3);
        aggregate.add(" ElementA ");
        aggregate.add(" ElementB ");
        aggregate.add(" ElementC ");

        Iterator<String> iterator = aggregate.createIterator();
        System.out.println("Traversing the aggregate front to back");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
