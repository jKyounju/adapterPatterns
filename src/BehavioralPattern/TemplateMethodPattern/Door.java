package BehavioralPattern.TemplateMethodPattern;

public class Door {
    private DoorStatus doorStatus;
    public Door(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }
    public void open() {
        doorStatus = DoorStatus.OPENED;
        System.out.println("The door is opened.");
    }

    public void closed() {
        doorStatus = DoorStatus.CLOSED;
        System.out.println("The door is closed.");
    }
}
