package BehavioralPattern.StatePattern.TCP;

import java.io.OutputStream;

public class Connected implements State {
    private static final Connected INSTANCE = new Connected();
    private Connected() {}

    public static Connected getInstance() {
        return INSTANCE;
    }

    @Override
    public void open(Connection c) {
        System.out.println("State CONNECTED: *** Can't open connection " +
                            "(connection already opened). ***");
        System.exit(-1);
    }

    @Override
    public void transmit(Connection c, OutputStream data) {
        System.out.println("State CONNECTED: Transmitting data ... Finished.");
    }

    @Override
    public void close(Connection c) {
        System.out.println("State changed from CONNECTED to CLOSED.");
    }
}
