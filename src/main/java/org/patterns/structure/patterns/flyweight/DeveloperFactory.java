package org.patterns.structure.patterns.flyweight;

import java.util.HashMap;

public class DeveloperFactory {

    private static final HashMap<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality.toLowerCase()) {
                case "java" -> {
                    System.out.println("Hiring java developer");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Hiring c++ developer");
                    developer = new CppDeveloper();
                }
            }
            developers.put(speciality, developer);
        }

        return developer;
    }
}
