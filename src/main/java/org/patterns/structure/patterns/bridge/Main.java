package org.patterns.structure.patterns.bridge;

public class Main {

    public static void main(String[] args) {

        Shape square = new Square(new Blue());
        square.draw();
    }
}
