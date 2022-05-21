package BehavioralPattern.StatePattern.Basic;

public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public String operation() {
        return "Context : Delegating state-specific behavior to the current State object.\n" +
                state.operation(this);
    }

    void setState(State state) {
        this.state = state;
    }
}
