package org.patterns.structure.patterns.composite;

public class Main {

    public static void main(String[] args) {
        Department departmentSales = new SalesDepartment();
        Department financialDepartment = new FinancialDepartment();

        HeadDepartment headDepartment = new HeadDepartment();
        headDepartment.addDepartment(departmentSales);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.getNameDepartment();
    }
}
