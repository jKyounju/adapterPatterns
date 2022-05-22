package BehavioralPattern.StrategyPattern.Order;

public interface Product {
    void operation();
    String getId();
    String getGroup();
    String getDescription();
    long getPrice();
}
