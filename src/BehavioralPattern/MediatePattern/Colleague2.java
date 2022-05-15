package BehavioralPattern.MediatePattern;

public class Colleague2 implements Colleague {
    private Mediator mediate;
    private String state;

    public Colleague2(Mediator mediate) {
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

    public void action2(String state) {
        System.out.println("Colleague2: My state synchronized to:" +state);
    }
}
