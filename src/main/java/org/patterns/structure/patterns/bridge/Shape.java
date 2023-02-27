package org.patterns.structure.patterns.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void draw();
}
