package BehavioralPattern.StrategyPattern.sort;

import java.util.Comparator;
import java.util.Objects;

public class PhoneNumber implements Comparator<PhoneNumber> {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;
    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix   = (short) prefix;
        this.lineNumber = (short) lineNumber;

    }
    private static void rangeCheck(int arg, int max, String name) {
        if(arg < 0 || arg > max)
            throw new IllegalArgumentException(name + " : " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNumber == that.lineNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNumber);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNumber=" + lineNumber +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compare(PhoneNumber o1, PhoneNumber o2) {
        return 0;
    }

    public int compareTo(PhoneNumber phoneNumber) {
        if(areaCode < phoneNumber.areaCode) return -1;
        if(areaCode > phoneNumber.areaCode) return 1;
        if(prefix   > phoneNumber.prefix) return -1;
        if(prefix   < phoneNumber.prefix) return 1;
        if(lineNumber > phoneNumber.lineNumber) return -1;
        if(lineNumber < phoneNumber.lineNumber) return 1;
        return 0;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNumber() {
        return lineNumber;
    }
}
