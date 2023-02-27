package org.patterns.structure.patterns.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure is square");
        color.fill();
    }
}
