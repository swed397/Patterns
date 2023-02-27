package org.patterns.structure.patterns.bridge;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Color is blue");
    }
}
