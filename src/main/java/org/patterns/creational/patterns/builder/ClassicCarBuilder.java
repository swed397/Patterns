package org.patterns.creational.patterns.builder;

public class ClassicCarBuilder extends AbstractCarBuilder{

    private String body;
    private String wheels;
    private String paint;

    public ClassicCarBuilder() {
    }

    @Override
    public Car buildCar() {
        return new Car(body, wheels, paint);
    }

    @Override
    public AbstractCarBuilder fixWheels() {
        System.out.println("Add classic wheels in classic car!");
        return this;
    }

    @Override
    public AbstractCarBuilder fixBody() {
        System.out.println("Make body in classic car!");
        return this;
    }

    @Override
    public AbstractCarBuilder paint() {
        System.out.println("Paint classic car!");
        return this;
    }
}
