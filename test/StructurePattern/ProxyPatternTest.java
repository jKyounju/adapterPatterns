package StructurePattern;

import CreatationalPattern.ProxyPattern.Proxy;
import CreatationalPattern.ProxyPattern.RealSubject;
import org.junit.jupiter.api.Test;

class ProxyPatternTest {
    @Test
    public void ProxyPattern() {
        Proxy proxy = new Proxy(new RealSubject());
        System.out.println(proxy.operation());
    }
}
