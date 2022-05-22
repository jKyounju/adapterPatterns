package BehavioralPattern.TemplateMethodPattern;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;
    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    protected abstract void moveMotor(Direction direction);

    public void move(Direction direction) {
        MotorStatus status = getMotorStatus();
        if(status == MotorStatus.MOVING) return;
        if(door.getDoorStatus() == DoorStatus.OPENED) door.closed();
        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
