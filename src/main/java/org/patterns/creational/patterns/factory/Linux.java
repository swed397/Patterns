package org.patterns.creational.patterns.factory;

public class Linux implements OS {

    public Linux() {
        System.out.println("Linux created");
    }

    @Override
    public void getOs() {
        System.out.println("Linux OS!");
    }
}
