package org.patterns.behavioral.patterns.template;

public class NetherlandsFlag extends AbstractThreeRowsFlag {
    @Override
    void drawUpperLevel() {
        System.out.println("Draw red stripe");
    }

    @Override
    void drawMiddleLevel() {
        System.out.println("Draw white stripe");
    }

    @Override
    void drawBottomLevel() {
        System.out.println("Draw blue stripe");
    }
}
