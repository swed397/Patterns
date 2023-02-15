package org.patterns.structure.patterns.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private static ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }

        expensiveObject.process();
    }
}
