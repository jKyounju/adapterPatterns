package BehavioralPattern.StatePattern.Basic;

public class State1 implements State {

    private static final State1 INSTANCE = new State1();
    private State1() {}
    public static State1 getInstance() {
        return INSTANCE;
    }

    @Override
    public String operation(Context context) {
        String result = " State1 : Hello World1!" +
                " Changing current state of Context to State2.";
        context.setState(State2.getInstance());
        return result;
    }
}
