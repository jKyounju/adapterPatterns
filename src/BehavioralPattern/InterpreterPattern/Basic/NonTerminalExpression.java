package BehavioralPattern.InterpreterPattern.Basic;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends AbstractExpression {
    private List<AbstractExpression> expressions = new ArrayList<AbstractExpression>();

    public NonTerminalExpression(String name) {
        super(name);
    }

    @Override
    public void interpret(Context context) {
        System.out.println(getName() + ": ");
        for(AbstractExpression expression : expressions) {
            System.out.println(
                    " interpreting ... " + expression.getName()
            );
            expression.interpret(context);
        }
        System.out.println(getName() + " finished.");
    }

    @Override
    public boolean add(AbstractExpression e) {
        return expressions.add(e);
    }
}
