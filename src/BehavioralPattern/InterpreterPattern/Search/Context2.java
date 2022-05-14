package BehavioralPattern.InterpreterPattern.Search;

import java.util.HashMap;
import java.util.Map;

public class Context2 {
    Map<String, Boolean> varExprMap = new HashMap<String, Boolean>();

    public void setVarExpr(VarExpr v, boolean b) {
        varExprMap.put(v.getName(), b);
    }

    public boolean getVarExpr(String name) {
        return varExprMap.get(name);
    }
}
