package BehavioralPattern;

import BehavioralPattern.TemplateMethodPattern.*;
import org.junit.jupiter.api.Test;

public class TemplateMethodPatternTest {

    @Test
    public void templateMethodPatternTest() {
        Door door = new Door(DoorStatus.CLOSED);
        Elevator elevator1 = new Elevator(door, new HyundaiMotor(door));
        Elevator elevator2 = new Elevator(door, new SamsungMotor(door));
        elevator1.move(Direction.DOWN);
        elevator2.move(Direction.UP);
    }
}
