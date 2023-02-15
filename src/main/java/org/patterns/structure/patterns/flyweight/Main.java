package org.patterns.structure.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("Java"));
        developers.add(developerFactory.getDeveloperBySpeciality("C++"));
        developers.add(developerFactory.getDeveloperBySpeciality("C++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
