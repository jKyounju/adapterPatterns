package StructurePattern.AdapterPattern;

public class Adapter implements CtypePort {

    private Iphone smartPhone;

    public Adapter(Iphone smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public void charge() {
        smartPhone.charge();
    }
}
