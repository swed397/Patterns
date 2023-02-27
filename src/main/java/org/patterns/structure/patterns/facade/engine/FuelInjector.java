package org.patterns.structure.patterns.facade.engine;

public class FuelInjector implements State{

    @Override
    public void turnOn() {
        System.out.println("Turn on fuel");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off fuel");
    }
}
