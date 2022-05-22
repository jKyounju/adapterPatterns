package BehavioralPattern.StrategyPattern.sort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;


public class Customers {
    private static final SimpleDateFormat dateFormatter =
            new SimpleDateFormat("dd.MM.yyyy");
    private Customers() { }
    public static final Comparator<Customer> NAME =
            (o1, o2) -> o1.getName().compareTo(o2.getName());
    public static final Comparator<Customer> PHONENUMBER =
            (o1, o2) -> o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
    public static final Comparator<Customer> BIRTHDAY =
            (o1, o2) -> o1.getBirthday().compareTo(o2.getBirthday());

    public static void checkData(int id, Name name, PhoneNumber pn, Date bd) {
        if (id < 0)
            throw new IllegalArgumentException("Customer id is negative");
        try {
            if(bd.compareTo(dateFormatter.parse("01.01.1900")) < 0 ||
               bd.compareTo(dateFormatter.parse("01.01.2000")) > 0)
                throw new IllegalArgumentException("Birthday before 1900 or after 2000");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> createTestData(int size) throws Exception {
        List<Customer> customerList = new ArrayList<Customer>(size);
        customerList.add(new Customer1(1,
                new Name("FirstName1", " LastName1"),
                new PhoneNumber(1, 2, 2), dateFormatter.parse("03.03.1980")));
        customerList.add(new Customer1(2,
                new Name("FirstName3", " LastName3"),
                new PhoneNumber(1, 3, 3), dateFormatter.parse("01.01.1970")));
        customerList.add(new Customer1(3,
                new Name("FirstName2", " LastName2"),
                new PhoneNumber(2, 1, 1), dateFormatter.parse("02.02.1980")));
        return customerList;
    }
}
