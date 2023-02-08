package org.patterns.creational.patterns.singleton;

public class Singleton {
    private static Singleton INSTANCE = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
