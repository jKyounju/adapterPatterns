package StructurePattern.AdapterPattern;

public class Adapter implements CtypePort {

    private EightpinPort smartPhone;

    public Adapter(EightpinPort smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public void charge() {
        smartPhone.charge();
    }
}
