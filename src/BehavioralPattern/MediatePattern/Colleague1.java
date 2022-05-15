package BehavioralPattern.MediatePattern;

public class Colleague1 implements Colleague {
    private Mediator mediate;
    private String state;

    public Colleague1(Mediator mediate) {
        this.mediate = mediate;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
        mediate.mediate(this);
    }

    public void action1(String state) {
        System.out.println("Colleague1: My state synchronized to: " + state);
    }
}
