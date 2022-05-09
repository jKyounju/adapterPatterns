package StructurePattern.ProxyPattern;

public class RealSubject extends Subject{
    @Override
    public String operation() {
        return "RealSubject!";
    }
}
