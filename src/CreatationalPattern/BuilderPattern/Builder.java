package CreatationalPattern.BuilderPattern;

public interface Builder {
    void buildPartA();
    void buildPartB();
    ComplexObject getResult();
}
