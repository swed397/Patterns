package org.patterns.structure.patterns.facade;

public class Main {

    public static void main(String[] args) {
        CarEngineFacade carEngine = new CarEngineFacade();

        carEngine.startEngine();
        System.out.println("Wrrr .......");
        carEngine.stopEngine();
    }
}
