package CreationalPattern;

import CreatationalPattern.BuilderPattern.Builder1;
import CreatationalPattern.BuilderPattern.ComplexObject;
import CreatationalPattern.BuilderPattern.Director;
import CreatationalPattern.BuilderPattern.Director2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderPatternTest {
    @Test
    public void BuilderPatternTest() {
        Director director1 = new Director(new Builder1());
        Director2 director2 = new Director2.builder().complexObject(new ComplexObject()).build();
        System.out.println(director1.construct());

        assertEquals(director1.construct(), director2.construct());

    }
}
