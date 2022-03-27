package AdapterPattern;

public class Iphone implements EightpinPort {
    private String product;

    public Iphone(String product) {
        this.product = product;
    }

    @Override
    public void charge() {
        System.out.println(product + " 충전중입니다.");
    }
}
