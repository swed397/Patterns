package org.patterns.structure.patterns.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return " Send work review";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + sendWeekReport();
    }
}
