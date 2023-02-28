package org.patterns.behavioral.patterns.template;

public abstract class AbstractThreeRowsFlag {

    abstract void drawUpperLevel();
    abstract void drawMiddleLevel();
    abstract void drawBottomLevel();

    public final void drawFlag() {
        drawFlagpole();
        drawBottomLevel();
        drawMiddleLevel();
        drawUpperLevel();
        drawBlazon();
    }

    private void drawFlagpole() {
        System.out.println("Draw flagpole");
    }

    void drawBlazon() {}
}
