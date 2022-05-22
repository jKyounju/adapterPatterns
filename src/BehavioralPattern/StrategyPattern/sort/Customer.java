package BehavioralPattern.StrategyPattern.sort;

import java.util.Comparator;
import java.util.Date;

public interface Customer extends Comparator<Customer> {
    int getId();
    Name getName();
    PhoneNumber getPhoneNumber();
    Date getBirthday();
}
