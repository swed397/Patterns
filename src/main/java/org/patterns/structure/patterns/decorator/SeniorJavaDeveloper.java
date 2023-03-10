package org.patterns.structure.patterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + makeCodeReview();
    }
}
