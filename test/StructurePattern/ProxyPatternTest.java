package StructurePattern;

import StructurePattern.ProxyPattern.Proxy;
import StructurePattern.ProxyPattern.RealSubject;
import org.junit.jupiter.api.Test;

class ProxyPatternTest {
    @Test
    public void ProxyPattern() {
        Proxy proxy = new Proxy(new RealSubject());
        System.out.println(proxy.operation());
    }
}
