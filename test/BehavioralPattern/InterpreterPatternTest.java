package BehavioralPattern;

import BehavioralPattern.InterpreterPattern.Basic.AbstractExpression;
import BehavioralPattern.InterpreterPattern.Basic.Context;
import BehavioralPattern.InterpreterPattern.Basic.NonTerminalExpression;
import BehavioralPattern.InterpreterPattern.Basic.TerminalExpression;
import BehavioralPattern.InterpreterPattern.Search.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InterpreterPatternTest {

    @Test
    public void interpreterPatternTest() {
        AbstractExpression ntExpr2 = new NonTerminalExpression("ntExpr2");
        ntExpr2.add(new TerminalExpression(" tExpr3"));
        ntExpr2.add(new TerminalExpression(" tExpr4"));
        ntExpr2.add(new TerminalExpression(" tExpr5"));
        AbstractExpression ntExpr1 = new NonTerminalExpression("ntExpr1");
        ntExpr1.add(new TerminalExpression("tExpr1"));
        ntExpr1.add(ntExpr2);
        ntExpr1.add(new TerminalExpression("tExpr2"));
        Context context = new Context();
        ntExpr1.interpret(context);
    }

    @Test
    public void interpreterPatternSearchTest() {
        List<Product> products = new ArrayList<>();
        products.add(new SalesProduct("PC1", "PC", "Product PC 1000", 1000));
        products.add(new SalesProduct("PC2", "PC", "Product PC 2000", 2000));
        products.add(new SalesProduct("PC3", "PC", "Product PC 3000", 3000));

        products.add(new SalesProduct("TV1", "PC", "Product TV 1000", 1000));
        products.add(new SalesProduct("TV2", "PC", "Product TV 2000", 2000));
        products.add(new SalesProduct("TV3", "PC", "Product TV 3000", 3000));

        VarExpr x = new VarExpr("X");
        VarExpr y = new VarExpr("Y");
        VarExpr z = new VarExpr("Z");

        Expression andExpr1 = new AndExpr();
        andExpr1.add(x);
        andExpr1.add(y);

        Expression andExpr2 = new AndExpr();
        andExpr2.add(y);
        andExpr2.add(z);

        Expression notExpr = new NotExpr();
        notExpr.add(x);
        andExpr2.add(notExpr);

        Expression expression = new OrExpr();
        expression.add(andExpr1);
        expression.add(andExpr2);
        Context2 context = new Context2();
        for(Product p : products) {
            context.setVarExpr(x, p.getGroup().equals("PC"));
            context.setVarExpr(y, p.getPrice() > 1000);
            context.setVarExpr(z, p.getDescription().contains("TV"));

            if(expression.evaluate(context)) {
                System.out.println("Product found: " + p.getDescription());
            }
        }
    }
}
