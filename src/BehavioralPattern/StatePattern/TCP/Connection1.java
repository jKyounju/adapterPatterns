package BehavioralPattern.StatePattern.TCP;

import java.io.OutputStream;

public class Connection1 extends Connection {

    private State state;

    public Connection1(State state) {
        this.state = state;
    }

    @Override
    void setState(State state) {
        this.state = state;
    }

    @Override
    public void open() {
        state.open(this);
    }

    @Override
    public void transmit(OutputStream data) {
        state.transmit(this, data);
    }

    @Override
    public void close() {
        state.close(this);
    }
}
