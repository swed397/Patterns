package org.patterns.behavioral.patterns.template;

public class RussianFlag extends AbstractThreeRowsFlag {
    @Override
    void drawUpperLevel() {
        System.out.println("Draw white stripe");
    }

    @Override
    void drawMiddleLevel() {
        System.out.println("Paint blue stripe");
    }

    @Override
    void drawBottomLevel() {
        System.out.println("Paint red stripe");
    }

    @Override
    void drawBlazon() {
        System.out.println("Draw blazon");
    }
}
