package org.patterns.structure.patterns.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable car;

    public MovableAdapterImpl(Movable car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convertMphToKmph(car.getSpeed());
    }

    private double convertMphToKmph(double mph) {
        return mph * 1.6;
    }
}
