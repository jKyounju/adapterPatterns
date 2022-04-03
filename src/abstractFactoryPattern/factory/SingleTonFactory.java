package abstractFactoryPattern.factory;

import product.*;

public abstract class SingleTonFactory {

    private static SingleTonFactory factory3;
    private static SingleTonFactory factory4;

    public static SingleTonFactory getFactory3()  {
        if(factory3 == null)
            factory3 = new Factory3();
        return factory3;
    }

    public static SingleTonFactory getFactory4() {
        if (factory4 == null)
            factory4 = new Factory4();
        return factory4;
    }

    public abstract Product createProductA();
    public abstract Product createProductB();

    private static class Factory3 extends SingleTonFactory {
        @Override
        public Product createProductA() {
            System.out.println("creating ProductA1");
            return new ProductA1();
        }

        @Override
        public Product createProductB() {
            System.out.println("creating ProductB1");
            return new ProductB1();
        }
    }

    private static class Factory4 extends SingleTonFactory {
        @Override
        public Product createProductA() {
            System.out.println("creating ProductA2");
            return new ProductA2();
        }

        @Override
        public Product createProductB() {
            System.out.println("creating ProductA1");
            return new ProductB2();
        }
    }

}
