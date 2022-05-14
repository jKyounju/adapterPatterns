package BehavioralPattern.InterpreterPattern.Basic;

public abstract class AbstractExpression {
    private String name;
    public AbstractExpression(String name) {
        this.name = name;
    }
    public abstract void interpret(Context context);

    public String getName() {
        return name;
    }

    public boolean add(AbstractExpression e) {
        return false;
    }
}
