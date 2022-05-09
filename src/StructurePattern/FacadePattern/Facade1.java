package StructurePattern.FacadePattern;

public class Facade1 extends Facade {

    private Class1 class1;
    private Class2 class2;
    private Class3 class3;

    public Facade1(Class1 class1, Class2 class2, Class3 class3) {
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
    }

    @Override
    public String operation() {
        return "Facade forward to "
                + class1.operation()
                + class2.operation()
                + class3.operation();
    }
}
