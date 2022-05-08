package CreatationalPattern.BuilderPattern;

import product.ProductA1;
import product.ProductB1;

public class Builder1 implements Builder {

    private ComplexObject co = new ComplexObject();

    @Override
    public void buildPartA() {
        System.out.println("Builder1 : creating and assembling productA1");
        co.add(new ProductA1());
    }

    @Override
    public void buildPartB() {
        System.out.println("Builder1 : creating and assembling productB1");
        co.add(new ProductB1());
    }

    @Override
    public ComplexObject getResult() {
        return co;
    }
}
