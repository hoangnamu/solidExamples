package com.company.liskovSubstitutionPrincipleRight;

public class Manager extends Employee implements EmployeeCalculateSalary {
    public int calculateSalary() {
        return workTime * PART_TIME_SALARY;
    }
}
