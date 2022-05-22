package BehavioralPattern.TemplateMethodPattern;

public class Elevator {
    private Door door;
    private Motor motor;

    public Elevator(Door door, Motor motor) {
        this.door = door;
        this.motor = motor;
    }

    public void move(Direction direction) {
        motor.moveMotor(direction);
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
