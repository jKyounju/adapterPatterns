package BehavioralPattern.IteratorPattern;

public class Custom1 implements Custom {
    private long sales;
    private String name;

    public Custom1(long sales, String name) {
        this.sales = sales;
        this.name = name;
    }

    public long getSales() {
        return sales;
    }

    @Override
    public String getName() {
        return name;
    }
}
