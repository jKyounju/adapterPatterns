package BehavioralPattern.ObserverPattern.Timer;

import BehavioralPattern.ObserverPattern.util.Observer;
import BehavioralPattern.ObserverPattern.util.Subject;

public class Clock extends Observer {
    private int hour;
    private int minute;
    private int second;
    private Timer subject;

    public Clock(Timer subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject s) {
        if(this.subject == s) {
            System.out.printf(
                    "Clock : Updated/Synchronized to : %02d:%02d:%02d %n",
                    subject.getHour(), subject.getMinute(), subject.getSecond());
        }
    }
}
