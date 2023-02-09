package org.patterns.creational.patterns.builder;

public abstract class AbstractCarBuilder {

    public abstract Car buildCar();

    public abstract AbstractCarBuilder fixWheels();
    public abstract AbstractCarBuilder fixBody();
    public abstract AbstractCarBuilder paint();
}
