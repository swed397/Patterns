package org.patterns.creational.patterns.builder;

public class Main {

    public static void main(String[] args) {

        AbstractCarBuilder sportCarBuilder = new SportCarBuilder();
        Engineer sportEngineer = new Engineer(sportCarBuilder);
        Car sportCar = sportEngineer.createCar();

        AbstractCarBuilder classicCarBuilder = new ClassicCarBuilder();
        Engineer classicEngineer = new Engineer(classicCarBuilder);
        Car classicCar = classicEngineer.createCar();
    }
}
