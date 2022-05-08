package CreatationalPattern.BuilderPattern;

public class Director {
    private Builder builder;
    private ComplexObject co;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String construct() {
        System.out.println("Director: Delegating constructing "
                    + "a complex object to a builder object.");
        builder.buildPartA();
        builder.buildPartB();
        co = builder.getResult();
        return "Hello World from " + co.getParts() + " objects!";
    }
}
