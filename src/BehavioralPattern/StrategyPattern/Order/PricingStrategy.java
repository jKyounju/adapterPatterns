package BehavioralPattern.StrategyPattern.Order;

public interface PricingStrategy {
    long calculate(Order order);
}
