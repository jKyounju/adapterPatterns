package BehavioralPattern.MementoPattern;

public class Originator {
    private String state;

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public class Memento {
        private String state;

        public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
    }
}
