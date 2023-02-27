package org.patterns.structure.patterns.facade.engine;

public class CoolingEngine implements State {
    @Override
    public void turnOn() {
        System.out.println("Turn on cooling");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off cooling");
    }
}
