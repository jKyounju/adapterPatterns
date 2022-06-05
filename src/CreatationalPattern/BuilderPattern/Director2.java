package CreatationalPattern.BuilderPattern;

import CreatationalPattern.product.ProductA1;
import CreatationalPattern.product.ProductB1;

public class Director2 {

    private ComplexObject complexObject;

    public static class builder {
        private ComplexObject complexObject;

        public builder complexObject(ComplexObject complexObject) {
            this.complexObject = complexObject;
            return this;
        }

        public Director2 build() {
            return new Director2(this);
        }
    }

    public Director2(builder builder) {
        this.complexObject = builder.complexObject;
    }

    public String construct() {
        System.out.println("Director: Delegating constructing "
                + "a complex object to a builder object.");
        complexObject.add(new ProductA1());
        complexObject.add(new ProductB1());
        return "Hello World from " + this.complexObject.getParts() + " objects!";
    }
}
