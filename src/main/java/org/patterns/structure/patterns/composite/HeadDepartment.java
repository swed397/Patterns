package org.patterns.structure.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private final List<Department> childDepartments;


    public HeadDepartment() {
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void getNameDepartment() {
        System.out.println("Head department");
        childDepartments.forEach(Department::getNameDepartment);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void deleteDepartment(Department department) {
        childDepartments.remove(department);
    }
}
