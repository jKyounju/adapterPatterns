package BehavioralPattern.InterpreterPattern.Search;

import java.util.Collections;
import java.util.Iterator;

public abstract class Expression {
    public abstract boolean evaluate(Context2 context);

    public boolean add(Expression e) {
        return false;
    }

    public Iterator<Expression> iterator() {
        return Collections.emptyIterator();
    }
}
