package BehavioralPattern.StrategyPattern.Order;

public interface OrderLine {
    Product getProduct();
    int getQuantity();
    long getPrice();
}
