package org.patterns.creational.patterns.factory;

public class Factory {

    public OS getCurrentOS(String input) {
        if (input != null && !input.equals("")) {
            OS os;

            switch (input.toLowerCase()) {
                case "windows" -> os = new Windows();
                case "linux" -> os = new Linux();
                case "mac" -> os = new Mac();
                default -> throw new RuntimeException("Illegal os!");
            }

            return os;
        } else {
            throw new RuntimeException("Input is null");
        }
    }
}
