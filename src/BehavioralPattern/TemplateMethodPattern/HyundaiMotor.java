package BehavioralPattern.TemplateMethodPattern;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Hyundai Motor is moving toward " + direction.toString());
    }
}
