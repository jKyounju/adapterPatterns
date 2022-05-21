package BehavioralPattern.StatePattern.Basic;

public class State2 implements State{
    private static final State2 INSTANCE = new State2();
    private State2() {}
    public static State2 getInstance() {
        return INSTANCE;
    }

    @Override
    public String operation(Context context) {
        String result = " State2 : Hello World1!" +
                " Changing current state of Context to State1.";
        context.setState(State1.getInstance());
        return result;
    }
}
