package BehavioralPattern.StrategyPattern.Order;

public class PercentagePricingStrategy implements PricingStrategy {
    @Override
    public long calculate(Order order) {
        int percentage = 10;

        long amount = order.getPrice();
        long rabat = amount / 100 * percentage;
        return amount - rabat;
    }
}
