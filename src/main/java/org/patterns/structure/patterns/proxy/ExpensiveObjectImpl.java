package org.patterns.structure.patterns.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heaveInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing obj");
    }

    private void heaveInitialConfiguration() {
        System.out.println("Loading heavy initial configuration");
    }
}
