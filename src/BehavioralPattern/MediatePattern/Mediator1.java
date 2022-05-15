package BehavioralPattern.MediatePattern;

public class Mediator1 extends Mediator {
    private Colleague1 colleague1;
    private Colleague2 colleague2;
    public void setColleague(Colleague1 colleague1, Colleague2 colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    @Override
    public void mediate(Colleague colleague) {
        System.out.println(" Mediator : Mediating the interaction ...");

        if( colleague instanceof  Colleague1) {
            String state = colleague1.getState();
            colleague2.action2(state);
        }
        else if( colleague instanceof  Colleague2 ){
            String state = colleague2.getState();
            colleague1.action1(state);
        }
    }
}
