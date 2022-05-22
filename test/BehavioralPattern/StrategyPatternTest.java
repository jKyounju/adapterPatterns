package BehavioralPattern;

import BehavioralPattern.IteratorPattern.Custom;
import BehavioralPattern.StrategyPattern.Basic.Context;
import BehavioralPattern.StrategyPattern.Basic.Strategy1;
import BehavioralPattern.StrategyPattern.Basic.Strategy2;
import BehavioralPattern.StrategyPattern.Order.*;
import BehavioralPattern.StrategyPattern.sort.Customer;
import BehavioralPattern.StrategyPattern.sort.Customers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyPatternTest {

    @Test
    public void strategyPatternText() {
        Context context = new Context(new Strategy1());
        System.out.println("(1) " + context.operation());
        context.setStrategy(new Strategy2());
        System.out.println("(2) " + context.operation());
    }

    @Test
    public void strategyOrderTest() {
        Order order = new SalesOrder(new PercentagePricingStrategy());
        Product product1A =  new SalesProduct("1A", "01", "ProductA", 100);
        Product product1B =  new SalesProduct("1B", "01", "ProductB", 200);
        order.createOrderLine(product1A,1);
        order.createOrderLine(product1B, 1);

        System.out.println(
                "(1) Total order brutto price .............................. : " +
                        order.getPrice()
        );

        System.out.println(
                "(2) using the default percentage strategy (10%) ........... : " +
                        order.getNetPrice()
        );

        System.out.println(
                "(3) changing to threshold strategy (10%; above 200: 20%): " +
                        order.getNetPrice(new ThresholdPricingStrategy())
        );
    }

    @Test
    public void strategySortTest() throws Exception {
        List<Customer> customerList = Customers.createTestData(3);
        System.out.println(
                "SORTING CUSTOMERS:\n\n" +
                        "(1) by using the default comparator \n" +
                        " = according to the customer ID: ");
        Collections.sort(customerList);
        System.out.println(customerList);
        System.out.println("\n" +
                "(2) by specifying the NAME comparator \n" +
                " = according to the customer name: ");
        Collections.sort(customerList, Customers.NAME);
        System.out.println(customerList);
        System.out.println("\n" +
                "(3) by implementing the comparator directly \n" +
                " = according to the (area code) of the customer phone number \n" +
                " and the customer name: ");
        Collections.sort(customerList, (c1, c2) -> {
            if (c1.getPhoneNumber().getAreaCode() <
                        c2.getPhoneNumber().getAreaCode()) return -1;
            if (c1.getPhoneNumber().getAreaCode() >
                        c2.getPhoneNumber().getAreaCode()) return 1;
            return (c1.getName().compareTo(c2.getName()));
        });
        System.out.println(customerList);

        System.out.println("\n" +
                "(4) by specifying the BIRTHDAY comparator \n" +
                " = according to the customer birthday descending: ");
        Collections.sort(customerList, Customers.BIRTHDAY);
        System.out.println(customerList);
    }
}
