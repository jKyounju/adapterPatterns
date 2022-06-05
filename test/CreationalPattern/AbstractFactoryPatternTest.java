package CreationalPattern;

import CreatationalPattern.FactoryMethodPattern.AbstractFM.Creator1;
import CreatationalPattern.FactoryMethodPattern.Creator;
import org.junit.jupiter.api.Test;

import java.lang.ref.Cleaner;
import java.lang.ref.WeakReference;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryPatternTest {
    @Test
    public void AbstractFactoryMethod() {
        Creator creator = new Creator1();
        var name = creator.factoryMethod().getName();

        assertEquals("Product1", name);
    }
}