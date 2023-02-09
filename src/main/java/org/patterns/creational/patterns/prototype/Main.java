package org.patterns.creational.patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Project master = new Project(1L, "New proj", "Java");
        ProjectFactory projectFactory = new ProjectFactory(master);

        Project projectCope = projectFactory.cloneProject();
        System.out.println(master);
        System.out.println(projectCope);
    }
}
