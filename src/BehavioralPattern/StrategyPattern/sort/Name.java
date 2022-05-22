package BehavioralPattern.StrategyPattern.sort;

import java.util.Comparator;

public class Name implements Comparator<Name> {
    private String firstName;
    private String lastName;
    public Name(String firstName, String lastName) {
        if(firstName == null || lastName == null)
            throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Name)) return false;
        Name name = (Name) obj;
        return firstName.equals(name.firstName)
                && lastName.equals(name.lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                '}';
    }

    public int compareTo(Name name) {
        int cmp = lastName.compareTo(name.lastName);
        if(cmp != 0) return cmp;
        return firstName.compareTo(name.firstName);
    }

    @Override
    public int compare(Name o1, Name o2) {
        return 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
