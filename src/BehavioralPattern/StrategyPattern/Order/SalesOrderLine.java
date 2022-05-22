package BehavioralPattern.StrategyPattern.Order;

public class SalesOrderLine implements OrderLine {
    private int quantity;
    private Product product;
    public SalesOrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public long getPrice() {
        return product.getPrice() * quantity;
    }
}
