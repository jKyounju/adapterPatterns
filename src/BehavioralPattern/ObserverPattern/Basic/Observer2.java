package BehavioralPattern.ObserverPattern.Basic;

import BehavioralPattern.ObserverPattern.util.Observer;
import BehavioralPattern.ObserverPattern.util.Subject;

public class Observer2 extends Observer {
    private int state;
    private Subject1 subject;
    public Observer2(Subject1 subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject s) {
        if(this.subject == s) {
            this.state = subject.getState();
            System.out.println("Observer2: State updated to : " + this.state);
        }
    }
}
