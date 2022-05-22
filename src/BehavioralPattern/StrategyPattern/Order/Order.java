package BehavioralPattern.StrategyPattern.Order;

public interface Order {
    long getPrice();
    long getNetPrice();
    long getNetPrice(PricingStrategy strategy);
    void createOrderLine(Product product, int quantity);
}
