package org.patterns.structure.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Developer develop = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(develop.writeCode());
    }
}
