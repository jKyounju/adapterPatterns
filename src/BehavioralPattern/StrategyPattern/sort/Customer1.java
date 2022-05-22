package BehavioralPattern.StrategyPattern.sort;

import java.util.Date;

public class Customer1 extends AbstractCustomer {
    public Customer1(int id, Name name, PhoneNumber pn, Date bd) {
        super(id, name, pn, bd);
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return 0;
    }
}
