package org.patterns.structure.patterns.proxy;

public class Main {

    public static void main(String[] args) {
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();

        expensiveObject.process();
        expensiveObject.process();
    }
}
