package BehavioralPattern.TemplateMethodPattern;

public class SamsungMotor extends Motor{
    public SamsungMotor(Door door) {
        super(door);
    }
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("Samsung Motor is moving toward " + direction.toString());
    }
}
