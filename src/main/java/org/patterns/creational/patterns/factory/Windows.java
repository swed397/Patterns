package org.patterns.creational.patterns.factory;

public class Windows implements OS{
    public Windows() {
        System.out.println("Windows created");
    }

    @Override
    public void getOs() {
        System.out.println("Windows os!");
    }
}
