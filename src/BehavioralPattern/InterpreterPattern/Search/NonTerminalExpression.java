package BehavioralPattern.InterpreterPattern.Search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NonTerminalExpression extends Expression {

    private final List<Expression> expressions = new ArrayList<Expression>();

    @Override
    public boolean add(Expression e) {
        return expressions.add(e);
    }

    @Override
    public Iterator<Expression> iterator() {
        return expressions.iterator();
    }
}
