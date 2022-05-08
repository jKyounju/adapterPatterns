package CreatationalPattern.BuilderPattern;

import product.ProductA2;
import product.ProductB2;

public class Builder2 implements Builder {

    private ComplexObject co;

    @Override
    public void buildPartA() {
        System.out.println("Builder2 : creating and assembling productA2");
        co.add(new ProductA2());
    }

    @Override
    public void buildPartB() {
        System.out.println("Builder2 : creating and assembling productB2");
        co.add(new ProductB2());
    }

    @Override
    public ComplexObject getResult() {
        return co;
    }
}
