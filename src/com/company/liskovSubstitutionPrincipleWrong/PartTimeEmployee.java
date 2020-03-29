package com.company.liskovSubstitutionPrincipleWrong;

public class PartTimeEmployee extends Employee {
    public int calculateSalary() {
        try {
            throw new Exception("Part time employees can not calculate their salary");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
