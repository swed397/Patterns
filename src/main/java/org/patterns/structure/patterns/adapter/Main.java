package org.patterns.structure.patterns.adapter;

public class Main {

    public static void main(String[] args) {

        Movable ferrari = new Ferrari();

        MovableAdapter movableAdapter = new MovableAdapterImpl(ferrari);

        System.out.println(ferrari.getSpeed());
        System.out.println(movableAdapter.getSpeed());
    }
}
