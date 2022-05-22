package BehavioralPattern.StrategyPattern.Order;


public class ThresholdPricingStrategy implements PricingStrategy {
    @Override
    public long calculate(Order order) {
        long threshold = 200;
        short percentageLow = 10;
        short percentageHigh = 20;

        long amount = order.getPrice();

        if(amount < threshold)
            return amount - amount / 100 * percentageLow;
        else
            return amount - amount / 100 * percentageHigh;
    }
}
