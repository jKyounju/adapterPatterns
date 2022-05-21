package BehavioralPattern.Observer.Timer;

import BehavioralPattern.Observer.util.Observer;
import BehavioralPattern.Observer.util.Subject;

import java.util.ArrayList;
import java.util.List;

public class Timer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick(int hour, int minute, int second) {
        System.out.printf("Timer : Time of day changed to : %02d:%02d:%02d \n",
                hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        notifyObservers();
    }
}
