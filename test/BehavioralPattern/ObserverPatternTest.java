package BehavioralPattern;

import BehavioralPattern.Observer.Basic.Observer1;
import BehavioralPattern.Observer.Basic.Observer2;
import BehavioralPattern.Observer.Basic.Subject1;
import BehavioralPattern.Observer.Timer.Clock;
import BehavioralPattern.Observer.Timer.Timer;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static BehavioralPattern.Observer.Gui.GUIDemo1.createAndShowGUI;

public class ObserverPatternTest {

    @Test
    public void observerBasicTest() {
        Subject1 s1 = new Subject1();

        Observer1 o1 = new Observer1(s1);
        Observer2 o2 = new Observer2(s1);

        System.out.println("changing state of Subject1 ...");
        s1.setState(100);
    }

    @Test
    public void observerTimerTest() throws InterruptedException {
        Timer timer = new Timer();
        Clock clock = new Clock(timer);
        final Calendar calendar = Calendar.getInstance();
        for(int i = 0; i < 3; ++i) {
            Thread.sleep(1000);
            calendar.setTimeInMillis(System.currentTimeMillis());
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            int second = calendar.get(Calendar.SECOND);
            timer.tick(hour, minute, second);
        }
    }

    @Test
    public void observerGUITest() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
