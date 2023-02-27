package org.patterns.structure.patterns.facade.engine;

public class AirFlowController implements State {

    @Override
    public void turnOn() {
        System.out.println("Turn on air");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off air");
    }
}
