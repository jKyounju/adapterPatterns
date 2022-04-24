package ProxyPattern;

public class Proxy extends Subject{

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String operation() {
        return "Hello World from proxy and " + realSubject.operation();
    }
}
