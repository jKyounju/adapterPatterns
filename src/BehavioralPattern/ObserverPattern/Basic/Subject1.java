package BehavioralPattern.ObserverPattern.Basic;

import BehavioralPattern.ObserverPattern.util.Subject;

public class Subject1 extends Subject {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        System.out.println(
                "Subject1 : State changed to : " + state +
                "\n Notifying observers ...");
        notifyObservers();
    }
}
