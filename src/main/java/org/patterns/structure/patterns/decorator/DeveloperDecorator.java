package org.patterns.structure.patterns.decorator;

public class DeveloperDecorator implements Developer {
    private final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String writeCode() {
        return developer.writeCode();
    }
}
