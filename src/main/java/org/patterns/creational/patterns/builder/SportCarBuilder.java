package org.patterns.creational.patterns.builder;

public class SportCarBuilder extends AbstractCarBuilder{

    private String body;
    private String wheels;
    private String paint;

    public SportCarBuilder() {
    }

    @Override
    public Car buildCar() {
        return new Car(body, wheels, paint);
    }

    @Override
    public AbstractCarBuilder fixWheels() {
        System.out.println("Add sport wheels in sport car!");
        return this;
    }

    @Override
    public AbstractCarBuilder fixBody() {
        System.out.println("Make body in sport car!");
        return this;
    }

    @Override
    public AbstractCarBuilder paint() {
        System.out.println("Paint sport car!");
        return this;
    }
}
