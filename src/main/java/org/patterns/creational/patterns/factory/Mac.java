package org.patterns.creational.patterns.factory;

public class Mac implements OS {

    public Mac() {
        System.out.println("Mac created");
    }

    @Override
    public void getOs() {
        System.out.println("Mac OS!");
    }
}
