package BehavioralPattern.InterpreterPattern.Search;

import java.util.Iterator;

public class NotExpr extends NonTerminalExpression {
    @Override
    public boolean evaluate(Context2 context) {
        Iterator<Expression> it = iterator();
        while(it.hasNext()) {
            if(it.next().evaluate(context)) {
                return false;
            }
        }
        return true;
    }
}
