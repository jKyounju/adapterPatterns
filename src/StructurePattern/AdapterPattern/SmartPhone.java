package StructurePattern.AdapterPattern;

public class SmartPhone implements CtypePort {
    private String product;

    public SmartPhone(String product) {
        this.product = product;
    }

    @Override
    public void charge() {
        System.out.println(product + " 충전중입니다.");
    }
}
