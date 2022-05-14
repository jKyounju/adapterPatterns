package BehavioralPattern.InterpreterPattern.Search;

public class VarExpr extends Expression{
    private String name;

    public VarExpr(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean evaluate(Context2 context) {
        return context.getVarExpr(name);
    }
}
