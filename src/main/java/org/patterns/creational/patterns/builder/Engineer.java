package org.patterns.creational.patterns.builder;

public class Engineer {

    private AbstractCarBuilder carBuilder;

    public Engineer(AbstractCarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car createCar() {
        return carBuilder.fixBody().fixWheels().paint().buildCar();
    }
}
