package BehavioralPattern.Observer.Basic;

import BehavioralPattern.Observer.util.Observer;
import BehavioralPattern.Observer.util.Subject;

public class Observer1 extends Observer {
    private int state;
    private Subject1 subject;
    public Observer1(Subject1 subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject s) {
        if(this.subject == s) {
            this.state = subject.getState();
            System.out.println("Observer1: State updated to : " + this.state);
        }
    }
}
