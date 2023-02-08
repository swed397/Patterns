package org.patterns.creational.patterns.factory;

public class FactoryTest {

    public static void main(String[] args) {

        Factory factory = new Factory();

        OS os = factory.getCurrentOS("Mac");
        os.getOs();
    }
}
